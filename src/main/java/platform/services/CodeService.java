package platform.services;

import platform.dto.CodeDTO;

import java.util.List;
import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
public interface CodeService {

    UUID saveCode(final CodeDTO dto);
    CodeDTO getCodeDTOById(final UUID id);
    List<CodeDTO> getLastTenCodes();
}
