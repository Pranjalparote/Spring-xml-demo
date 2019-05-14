

package com.stackroute.domain;

public class Movie {
    Actor actor;


    public Movie() {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }


    @Override
    public String toString() {
        return "Actor Name: " + actor.getName() + "\n" + "Acter gender:" + actor.getGender() + "\n" + "Acter age:" + actor.getAge();
    }
}

