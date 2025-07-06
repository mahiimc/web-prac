package com.lookup.solution;

import com.lookup.PrototypeBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // by default singleton
@Slf4j
public abstract class SolutionSingletonBean {


    public void callPrototypeBean() {
        PrototypeBean prototypeBean = getPrototypeBean();
        log.info( "Prototype Bean  Message : {} , Bean hash : {}", prototypeBean.sayHi(), prototypeBean.hashCode());
    }

    @Lookup
    public abstract PrototypeBean getPrototypeBean();
}
