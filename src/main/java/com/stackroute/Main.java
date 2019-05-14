package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext movieBean = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) movieBean.getBean("movie1");
        Movie movie2 = (Movie) movieBean.getBean("movie2");
        Movie movie3 = (Movie) movieBean.getBean("movie3");
        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
        System.out.println(movie3.toString());
        System.out.println(movie1 == movie3);
    }
}






