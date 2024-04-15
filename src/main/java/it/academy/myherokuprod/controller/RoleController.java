package it.academy.myherokuprod.controller;

import it.academy.myherokuprod.entity.Role;
import it.academy.myherokuprod.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getAll")
    public ResponseEntity<List<Role>> getAll() {
        List<Role> roles = service.allRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        try {
            return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}