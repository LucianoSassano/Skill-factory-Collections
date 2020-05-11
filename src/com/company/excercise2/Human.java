package com.company.excercise2;

public class Human extends Competitor implements Sprintable{

    private String name;
    private Double speed;


    public Human() {}

    public Human(String name) {
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

        this.speed = (Math.random() * (35 - 7) + 1) + 7;
    }

    @Override
    public String toString() {
        return " Human => " +
                " * name= '" + name + '\'' +
                ", * speed = " + speed + " km/h " ;
    }

    @Override
    public Double run(Double distance) {
        return  (distance/this.speed) * 60;
    }
}
