package com.company.excercise2;

import sun.plugin2.gluegen.runtime.CPU;

public class Dog extends Competitor implements Sprintable {

    private String name;
    private Double speed;


    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
        setSpeed();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = (Math.random() * (60 - 30 ) + 1 ) + 30;
    }

    @Override
    public String toString() {
        return " Dog => " +
                " * name = '" + name + '\'' +
                ", * speed = " + speed + " km/h " ;
    }

    @Override
    public Double run(Double distance) {
        return  (distance/this.speed) * 60;
    }
}
