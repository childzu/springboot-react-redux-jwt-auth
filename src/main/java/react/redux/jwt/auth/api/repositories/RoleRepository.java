package react.redux.jwt.auth.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import react.redux.jwt.auth.api.entities.Role;
import react.redux.jwt.auth.api.models.ERole;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
