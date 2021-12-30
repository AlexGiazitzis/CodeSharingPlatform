package platform.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import platform.utils.Default;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Alex Giazitzis
 */
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Default)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity(name = "endpoint")
public class Endpoint {

    @Id
    String path;

    @Column(nullable = false)
    String method;

    @Column(nullable = false, columnDefinition = "varchar(max)")
    String description;

    @Column(nullable = false, columnDefinition = "varchar(max)")
    String exampleRequest;

    @Column(nullable = false, columnDefinition = "varchar(max)")
    String exampleResponse;

}
