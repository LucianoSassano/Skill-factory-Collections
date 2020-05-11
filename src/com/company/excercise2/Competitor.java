package com.company.excercise2;

public abstract class Competitor {

    public String name;
    public Double speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double run(Double distance) {
        return  (distance/this.speed) * 60;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }


}
