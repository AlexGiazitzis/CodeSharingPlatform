package platform.dto;

import lombok.Value;

/**
 * @author Alex Giazitzis
 */
@Value
public class EndpointDTO {
    String path;
    String method;
    String description;
    String exampleRequest;
    String exampleResponse;
}
