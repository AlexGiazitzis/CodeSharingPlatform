package platform.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Value;

import java.time.LocalDateTime;

/**
 * @author Alex Giazitzis
 */
@Value
public class CodeDTO {
    String code;

    @JsonFormat(pattern = "EEE. MMM. dd yyyy '@' HH:mm:ss a")
    LocalDateTime date;

    long time;

    @JsonIgnore
    boolean timeLimited;

    int views;

    @JsonIgnore
    boolean viewLimited;
}
