
package com.stackroute.domain;


public class Movie {
    Actor actor;


    public Movie() {

    }


    @Override
    public String toString() {
        return "ActorName=" + actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }
}


