package dev.sand.box.toolkit.web.webservices;

import dev.sand.box.toolkit.service.role.RoleService;
import dev.sand.box.toolkit.web.dto.RoleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Web Service responsible to users/roles.
 */
@RestController
@RequestMapping(value = "/roles")
public class RolesWS {
    private static final Logger LOG = LoggerFactory.getLogger(RolesWS.class);

    @Autowired
    private RoleService roleService;

    //@Autowired
    //private RoleMapper roleMapper;

    @GetMapping
    public List<RoleDTO> getAllRoles() {
        LOG.info("GET /all-roles");
        //return roleMapper.toDTOList(roleService.allRoles());
        return new ArrayList<>();
    }
}
