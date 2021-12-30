package platform.services.impl;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import platform.dto.CodeDTO;
import platform.entities.Code;
import platform.mappers.CodeMapper;
import platform.repos.CodeRepository;
import platform.services.CodeService;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CodeServiceImpl implements CodeService {

    CodeMapper     codeMapper;
    CodeRepository codeRepository;

    @Override
    public UUID saveCode(final CodeDTO dto) {
        Code code = codeMapper.codeDtoToCode(dto);
        if (code.getViews() > 0) {
            code.setViews(code.getViews() + 1);
        }
        codeRepository.save(code);
        return code.getId();
    }

    @Override
    public CodeDTO getCodeDTOById(final UUID id) {
        CodeDTO dto = null;

        Optional<Code> codeOptional = codeRepository.findCodeById(id);
        if (codeOptional.isPresent()) {
            Code code = codeOptional.get();
            if (code.getDeletionDate() != null && LocalDateTime.now().compareTo(code.getDeletionDate()) >= 0) {
                codeRepository.delete(code);
            } else {
                if (code.getDeletionDate() != null) {
                    code.setTime(ChronoUnit.SECONDS.between(LocalDateTime.now(), code.getDeletionDate()));
                    codeRepository.save(code);
                }
                if (code.getViews() > 0) {
                    code.setViews(code.getViews() - 1);
                    if (code.getViews() == 0) {
                        codeRepository.delete(code);
                    } else {
                        codeRepository.save(code);
                    }
                }
                dto = codeMapper.codeToCodeDto(code);
            }
        }
        return dto;
    }

    @Override
    public List<CodeDTO> getLastTenCodes() {
        List<Code> codeList = codeRepository.findLatestAndNotHidden();
        if (codeList.size() > 10) {
            codeList = codeList.subList(0, 10);
        }
        return codeMapper.codeListToDto(codeList);
    }

    // run every day at 00:00
    @Scheduled(cron = "0 0 0 * * ?")
    private void cleanup() {
        List<Code> codeList = codeRepository.findAllByTimeGreaterThan(0L);
        for (Code code : codeList) {
            if (LocalDateTime.now().compareTo(code.getDeletionDate()) >= 0) {
                codeRepository.delete(code);
            }
        }
    }
}
