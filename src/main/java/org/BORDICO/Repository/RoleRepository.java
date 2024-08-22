package org.BORDICO.Repository;

import org.BORDICO.Model.Entity.User;
import org.BORDICO.Model.Enum.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<User, Position> {
}
