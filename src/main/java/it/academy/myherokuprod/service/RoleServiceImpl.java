package it.academy.myherokuprod.service;

import it.academy.myherokuprod.dto.RoleDto;
import it.academy.myherokuprod.entity.Role;
import it.academy.myherokuprod.repo.RoleRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<Role> allRoles() {
        return roleRepo.findAll();
    }

    @Override
    public ResponseEntity<String> updateRole(Long id) {
        return new ResponseEntity<String>("Role updated successfully");

    }
}