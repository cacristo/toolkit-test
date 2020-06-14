package dev.sand.box.toolkit.web.webservices;

import dev.sand.box.toolkit.service.user.UserService;
import dev.sand.box.toolkit.web.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Web Service responsible to users/roles.
 */
@RestController
@RequestMapping(value = "/users")
public class UsersWS {
    private static final Logger LOG = LoggerFactory.getLogger(UsersWS.class);

    @Autowired
    private UserService userService;

    //@Autowired
    //private UserMapper userMapper;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        LOG.info("GET /all-users");
        //return userMapper.toDTOList(userService.allUsers());
        return new ArrayList<>();
    }

    @PostMapping(value = "/edit")
    public UserDTO editUser(@RequestBody UserDTO userDTO) {
        LOG.info("POST∫ /edit");
        //return userMapper.toDTO(userService.edit(userMapper.toEntity(userDTO)));
        return new UserDTO();
    }
}
