package demo.service;


import demo.model.Role;
import demo.model.User;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);

    void getUserRoles(User user);
}

