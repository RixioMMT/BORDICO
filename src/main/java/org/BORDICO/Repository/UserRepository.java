package org.BORDICO.Repository;

import org.BORDICO.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
