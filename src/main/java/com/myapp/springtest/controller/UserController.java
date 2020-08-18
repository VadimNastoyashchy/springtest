package com.myapp.springtest.controller;

import com.myapp.springtest.model.User;
import com.myapp.springtest.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Vadym Nastoiashchyi
 */

@Controller
public class UserController {
    private UserService userService;

    @GetMapping("/users")
    public String findAll(){
        List<User> userList = userService.findAll();
        return "";
    }
}
