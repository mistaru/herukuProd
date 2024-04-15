package it.academy.myherokuprod.controller;

import it.academy.myherokuprod.entity.Role;
import it.academy.myherokuprod.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService service;

    @PostMapping
    public ResponseEntity<Long> save(@RequestBody Role roleDto) {
        return service.save(roleDto);
    }
    @PostMapping("/create/v2")
    public ResponseEntity<Long> create (@RequestBody Role role){
        return service.save(role);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Role>> getAll() {
        List<Role> roles = service.allRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }
}