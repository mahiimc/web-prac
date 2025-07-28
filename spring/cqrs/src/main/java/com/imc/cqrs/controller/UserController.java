package com.imc.cqrs.controller;

import com.imc.cqrs.dto.UserDTO;
import com.imc.cqrs.model.User;
import com.imc.cqrs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
class UserController{

    private final UserService userService;

    @PostMapping("/")
    public User  writeUser(@RequestBody User user) {
        userService.writeUser(user);
        return user;
    }

    @GetMapping("/{userId}")
    public UserDTO readUser(@PathVariable Long userId) {
        return  userService.readUser(userId);
    }
}