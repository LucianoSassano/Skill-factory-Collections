package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> knownTec1 = new ArrayList<String>();
        Programmer p1 = new Programmer("Luciano", 21,knownTec1,"JavaScript" );
        p1.addTechnologyToList("HTML");
        p1.addTechnologyToList("Java");
        p1.addTechnologyToList("C");
        p1.addTechnologyToList("JavaScript");


    }
}
