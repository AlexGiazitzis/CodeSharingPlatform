package platform.mappers;

import org.mapstruct.*;
import platform.dto.CodeDTO;
import platform.entities.Code;

import java.util.List;

/**
 * @author Alex Giazitzis
 */
@Mapper
public interface CodeMapper {

    CodeDTO codeToCodeDto(Code code);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "code", source = "dto.code"),
            @Mapping(target = "date", expression = "java(java.time.LocalDateTime.now())"),
            @Mapping(target = "deletionDate", ignore = true),
            @Mapping(target = "time", source = "dto.time", defaultValue = "0"),
            @Mapping(target = "timeLimited", ignore = true),
            @Mapping(target = "views", source = "dto.views", defaultValue = "0"),
            @Mapping(target = "viewLimited", ignore = true)
    })
    Code codeDtoToCode(CodeDTO dto);

    List<CodeDTO> codeListToDto(List<Code> codes);

    @AfterMapping
    default void setDeletionDate(@MappingTarget Code code) {
        if (code.getTime() > 0L) {
            code.setDeletionDate(code.getDate().plusSeconds(code.getTime()));
            code.setTimeLimited(true);
        }
        if (code.getViews() > 0) {
            code.setViewLimited(true);
        }
    }
}
