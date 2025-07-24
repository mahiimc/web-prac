package com.proxy.controller;


import com.proxy.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterfaceInjectionController {

    private final UserService userService;

    public InterfaceInjectionController(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        System.out.println("Interface Injection : " + userService.getClass().getName());
    }
}
