package it.academy.myherokuprod.repo;

import it.academy.myherokuprod.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}