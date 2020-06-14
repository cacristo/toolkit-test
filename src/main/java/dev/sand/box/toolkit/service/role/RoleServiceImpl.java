package dev.sand.box.toolkit.service.role;

import dev.sand.box.toolkit.entity.role.Role;
import dev.sand.box.toolkit.repository.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service to manage {@link Role} object
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    /**
     * @see RoleService#allRoles() for more information
     */
    @Override
    public List<Role> allRoles() {
        return roleRepository.findAll();
    }
}
