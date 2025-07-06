package com.lookup;

import com.lookup.problem.ProblemSingletonBean;
import com.lookup.solution.ConstructorInjectionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private  ProblemSingletonBean problemBean;

    @Autowired
    private ConstructorInjectionBean solutionBean;


    @GetMapping("/test")
    public void getRequest() {
        problemBean.callPrototypeBean();
    }

    @GetMapping("/test/v2")
    public void getRequestV2() {
        solutionBean.callPrototypeBean();
    }

}
