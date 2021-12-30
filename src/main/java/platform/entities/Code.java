package platform.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;
import platform.utils.Default;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Default)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity(name = "code")
public class Code {

    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(insertable = false, nullable = false, updatable = false, unique = true)
    UUID           id;

    @Column(nullable = false, updatable = false, columnDefinition = "varchar(max)")
    String        code;

    @Column(nullable = false, updatable = false)
    LocalDateTime date;

    @Column(updatable = false)
    LocalDateTime deletionDate;

    @Column(nullable = false, updatable = false)
    long time;

    @Column(nullable = false)
    boolean timeLimited;

    @Column(nullable = false)
    int views;

    @Column(nullable = false)
    boolean viewLimited;
}
