/*Task 6:
        From the bean-lifecycle branch of spring-xml-demo repo create a bean-post-
        processor branch.
        Add a BeanPostProcessorDemoBean class in com.stackroute.demo that implements
        BeanPostProcessor
        Override the required methods to print out messages.
        Define BeanLifecycleDemoBean as a bean in beans.xml.
        Run the application and observe the result.
        Push the code to bean-post-processor branch.*/

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






