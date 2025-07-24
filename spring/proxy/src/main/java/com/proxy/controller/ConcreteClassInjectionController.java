package com.proxy.controller;


import com.proxy.service.ManagerService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/")
public class ConcreteClassInjectionController {

    private final ManagerService managerService;

    public ConcreteClassInjectionController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping("/name")
    public String getName() {
        System.out.println("Inside the getName class");
       return managerService.getManagerName();
    }

    @PostConstruct
    public void init() throws NoSuchMethodException {
//        System.out.println("managerService.getManagerName();" + managerService.getClass().getDeclaredMethod("getManagerName").getName());
        System.out.println("managerService.getManagerName();" + ManagerService.class.getDeclaredMethod("getManagerName").getName());
        System.out.println("Concrete Injection : " + managerService.getClass().getName());
    }
}
