package com.stackroute.AnnotationDemoPrograms;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInject {
    public static void main(String[] args) {
        ApplicationContext movieBean = new ClassPathXmlApplicationContext("beans.xml");
        MovieInject movieInject1 = (MovieInject) movieBean.getBean("movieA");
        MovieInject movieInject2 = (MovieInject) movieBean.getBean("movieB");
        System.out.println(movieInject1.toString());
        System.out.println(movieInject2.toString());
    }
}
