package com.company.excercise2;

import java.util.List;

public class Marathon {

    public Double distance;
    public List competitors;

    public Marathon() {
    }

    public Marathon(Double distance, List competitors) {
        this.distance = distance;
        this.competitors = competitors;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List competitors) {
        this.competitors = competitors;
    }




    @Override
    public String toString() {
        return " Marathon => " +
                " * distance  = " + distance +" km"+
                ", competitors = " + competitors ;
    }
}
