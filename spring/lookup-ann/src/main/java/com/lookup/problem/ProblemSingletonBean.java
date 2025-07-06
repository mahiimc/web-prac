package com.lookup.problem;

import com.lookup.PrototypeBean;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // by default singleton
@Slf4j
@RequiredArgsConstructor
public class ProblemSingletonBean {

    private final   PrototypeBean prototypeBean;

    public void callPrototypeBean() {
        log.info( "Prototype Bean  Message : {} , Bean hash : {}", prototypeBean.sayHi(), prototypeBean.hashCode());
    }
}
