/*From the aware-interface branch of spring-xml-demo repo create a bean-lifecycle
        branch.
        Add a BeanLifecycleDemoBean class in com.stackroute.demo that implements
        InitializingBean and DisposableBean.
        Override the required methods to print out messages.
        Define BeanLifecycleDemoBean as a bean in beans.xml.
        Run the application and observe the result.*/

package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext movieBean = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie)movieBean.getBean("movieA");
        Movie movie2 = (Movie)movieBean.getBean("movieB");
        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
    }
}






