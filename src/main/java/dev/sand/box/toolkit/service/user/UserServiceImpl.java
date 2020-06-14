package dev.sand.box.toolkit.service.user;

import dev.sand.box.toolkit.entity.user.User;
import dev.sand.box.toolkit.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service to manage {@link User} object
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * @see UserService#allUsers() for more information
     */
    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    /**
     * @see UserService#edit(User) for more information
     */
    @Override
    public User edit(User users) {
        User entitySaved = null;
        Optional<User> optionalUser = userRepository.findById(users.getId());
        if (optionalUser.isPresent()) {
            User entity = optionalUser.get();
            entity.setRole(users.getRole());
            entitySaved = userRepository.save(entity);
        }
        return entitySaved;
    }
}
