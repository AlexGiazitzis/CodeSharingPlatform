package platform.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import platform.dto.CodeDTO;
import platform.services.CodeService;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiController {
    private final CodeService codeService;

    @PostMapping(value = "/code/new")
    public Map<String, UUID> postNewCode(@RequestBody CodeDTO dto) {
        if (dto.getCode().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
        }
        return Map.of("id", codeService.saveCode(dto));
    }

    @GetMapping("/code/{id}")
    public CodeDTO getCodeById(@PathVariable final UUID id) {
        CodeDTO dto = codeService.getCodeDTOById(id);
        if (dto == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return dto;
    }

    @GetMapping("/code/latest")
    public List<CodeDTO> getLatestCodes() {
        return codeService.getLastTenCodes();
    }
}
