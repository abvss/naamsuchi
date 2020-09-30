package in.abvss.naamsuchi.repository;

import in.abvss.naamsuchi.model.Role;
import in.abvss.naamsuchi.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * Created by ameyjadiye on 30/09/2020.
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
