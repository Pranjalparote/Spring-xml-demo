package com.stackroute.domain;

public class Movie {
    Actor actor;


    public Movie() {

    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
    @Override
    public String toString() {
        return "ActorName=" + actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}


