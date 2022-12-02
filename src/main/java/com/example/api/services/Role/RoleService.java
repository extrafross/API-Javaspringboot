package com.example.api.services.Role;

import com.example.api.entities.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAllRoles();
    Role findRolesById(int id);
    boolean saveRole(Role role);
    boolean deleteRoleById(int id);
}
