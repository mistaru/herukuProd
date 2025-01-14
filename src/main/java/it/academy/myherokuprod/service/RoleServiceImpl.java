package it.academy.myherokuprod.service;

import it.academy.myherokuprod.entity.Role;
import it.academy.myherokuprod.repo.RoleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepo roleRepo;

    @Override
    public ResponseEntity<Long> save(Role roleDto) {
        Role savedRole = roleRepo.save(roleDto);
        return new ResponseEntity<>(savedRole.getId(), HttpStatus.CREATED);
    }

    @Override
    public String save2(Role role) {
        return roleRepo.save(role).getName();
    }

    @Override
    public List<Role> allRoles() {
        return roleRepo.findAll();
    }
}