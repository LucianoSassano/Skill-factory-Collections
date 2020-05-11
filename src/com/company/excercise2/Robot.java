package com.company.excercise2;

public class Robot extends Competitor implements Sprintable {

    private String name;
    private Double speed;

    public Robot() {
    }

    public Robot(String name) {
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
        this.speed = (Math.random() * (120 - 20 ) + 1 ) + 20;
    }

    @Override
    public String toString() {
        return " Robot => " +
                " * name = '" + name + '\'' +
                ", * speed = " + speed + " km/h ";
    }

    @Override
    public Double run(Double distance) {
        return  (distance/this.speed) * 60;
    }
}
