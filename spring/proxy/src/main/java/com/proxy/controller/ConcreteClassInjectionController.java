package com.proxy.controller;


import com.proxy.service.ManagerService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcreteClassInjectionController {

    private final ManagerService managerService;

    public ConcreteClassInjectionController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @PostConstruct
    public void init() {
        System.out.println("Concrete Injection : " + managerService.getClass().getName());
    }
}
