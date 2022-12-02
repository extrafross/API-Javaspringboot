package com.example.api.services.Role;

import com.example.api.entities.Role;
import com.example.api.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRolesById(int id) {
        return roleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Role tidak ditemukan"));
    }

    @Override
    public boolean saveRole(Role role) {
        roleRepository.save(role);
        return roleRepository.findById(role.getId()).isPresent();
    }

    @Override
    public boolean deleteRoleById(int id) {
        roleRepository.deleteById(id);
        return !roleRepository.findById(id).isPresent();
    }
}
