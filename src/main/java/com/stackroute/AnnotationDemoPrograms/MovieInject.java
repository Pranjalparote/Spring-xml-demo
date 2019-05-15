package com.stackroute.AnnotationDemoPrograms;

import org.springframework.context.annotation.Configuration;

public class MovieInject {
    private int id;
     public String name;
@Configuration
    public MovieInject() {
    }

    public MovieInject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
