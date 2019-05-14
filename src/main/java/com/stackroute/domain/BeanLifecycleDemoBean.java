package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("In destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In after properties set");

    }
}
