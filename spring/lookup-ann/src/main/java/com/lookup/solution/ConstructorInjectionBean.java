package com.lookup.solution;


import com.lookup.PrototypeBean;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@Slf4j
public class ConstructorInjectionBean {

    private final ObjectProvider<PrototypeBean> prototypeBeanProvider;

    public void callPrototypeBean() {
        PrototypeBean prototypeBean = prototypeBeanProvider.getObject();
        log.info( "Prototype Bean  Message : {} , Bean hash : {}", prototypeBean.sayHi(), prototypeBean.hashCode());
    }

}
