package platform.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import platform.entities.Endpoint;

import java.util.List;

/**
 * @author Alex Giazitzis
 */
@Repository
public interface EndpointRepository extends CrudRepository<Endpoint, String> {
    List<Endpoint> getAllBy();
}
