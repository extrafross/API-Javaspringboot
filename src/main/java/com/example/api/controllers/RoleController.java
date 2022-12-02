package com.example.api.controllers;

import com.example.api.entities.Role;
import com.example.api.services.Role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/roles")
    public List<Role> roleIndex() {
        return roleService.findAllRoles();
    }

    @GetMapping("/roles/{id}")
    public Role roleIndexById(@PathVariable int id) {
        return roleService.findRolesById(id);
    }
}
