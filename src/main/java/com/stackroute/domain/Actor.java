package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    Actor() {

    }

    Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }



}
