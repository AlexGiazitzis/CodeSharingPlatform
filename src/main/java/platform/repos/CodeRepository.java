package platform.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import platform.entities.Code;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CodeRepository extends CrudRepository<Code, UUID> {
    Optional<Code> findCodeById(final UUID id);

    List<Code> findAllByTimeGreaterThan(long time);

    @Query("SELECT new platform.entities.Code(id, code, date, deletionDate, time, timeLimited, views, viewLimited) FROM code WHERE time = 0 AND views = 0 ORDER BY date DESC")
    List<Code> findLatestAndNotHidden();
}