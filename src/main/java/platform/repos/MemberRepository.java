package platform.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import platform.entities.Member;

import java.util.List;
import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
@Repository
public interface MemberRepository extends CrudRepository<Member, UUID> {
    List<Member> getAllBy();
}
