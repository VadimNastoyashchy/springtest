package com.myapp.springtest.service;

import com.myapp.springtest.model.User;
import com.myapp.springtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vadym Nastoiashchyi
 */

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.getOne(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User saveUser(User user) {
        return userRepository.save(user);

    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);

    }
}
