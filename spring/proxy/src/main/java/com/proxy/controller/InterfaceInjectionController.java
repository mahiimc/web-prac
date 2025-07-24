package com.proxy.controller;


import com.proxy.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interface")
public class InterfaceInjectionController {

    private final UserService userService;

    public InterfaceInjectionController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getName() throws NoSuchMethodException {
        System.out.println("userService.findUsername();" + userService.getClass().getDeclaredMethod("findUsername").getName());
        return  userService.findUsername();
    }

    @PostConstruct
    public void init() {
        System.out.println("Interface Injection : " + userService.getClass().getName());
    }
}
