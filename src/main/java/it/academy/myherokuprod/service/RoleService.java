package it.academy.myherokuprod.service;

import it.academy.myherokuprod.entity.Role;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RoleService {
    ResponseEntity<Long> save(Role role);

    List<Role> allRoles();

    ResponseEntity<String> updateRole(Long id);

}