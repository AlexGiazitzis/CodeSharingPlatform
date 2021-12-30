package platform.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import platform.utils.Default;

import javax.persistence.*;

/**
 * @author Alex Giazitzis
 */
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Default)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, updatable = false)
    int ssn;

    @Column
    String icon;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String title;

    @Column(nullable = false, columnDefinition = "varchar(max)")
    String description;

    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    int phoneNumber;
}
