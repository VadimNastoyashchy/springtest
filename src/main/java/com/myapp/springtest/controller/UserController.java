package com.myapp.springtest.controller;

import com.myapp.springtest.model.User;
import com.myapp.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Vadym Nastoiashchyi
 */

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findAll(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("users", userList);
        return "user-list";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user){
        return "/user-create";
    }

    @PostMapping("/user-create")
    public String crateUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
}
