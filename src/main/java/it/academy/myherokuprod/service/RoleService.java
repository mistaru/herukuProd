package it.academy.myherokuprod.service;

import it.academy.myherokuprod.entity.Role;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RoleService {
    ResponseEntity<Long> save(Role role);

    String save2 (Role role);

    List<Role> allRoles();

    Role getById(Long Id);


}