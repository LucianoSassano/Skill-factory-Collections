package com.company;


import com.company.excercise1.ScrumMaster;
import com.company.excercise1.Programmer;
import com.company.excercise1.ProjectManager;
import com.company.excercise2.*;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        // Excerise 1

       /* ArrayList<String> knownTec1 = new ArrayList<String>();
        Programmer p1 = new Programmer("Luciano", 21,knownTec1,"JavaScript" );
        p1.addTechnologyToList("HTML");
        p1.addTechnologyToList("Java");
        p1.addTechnologyToList("C");
        p1.addTechnologyToList("JavaScript");
*/

      /*  Map<String, Integer> subs1 = new HashMap<String, Integer>();
        //nombre = key = value = nombre del programador


        ProjectManager pm1 = new ProjectManager("Antonio", 40, subs1, "Cobol");

        pm1.addSubordinates("frontend", 4);
        pm1.addSubordinates("backend", 10);
        pm1.addSubordinates("testers", 5);
        pm1.showSubordinates();
        pm1.getSubordiantesAmount("testers");
        pm1.removeCategory("frontend");
*/

  /*      Set<String> tasks1 = new LinkedHashSet<String>();

        ScrumMaster sm1 = new ScrumMaster("Javier",47,tasks1,"Python");
        sm1.addTask("Trabajar");
        sm1.addTask("Dormir");
        sm1.addTask("Correr");
        sm1.showAllTasks();
        sm1.invertTaskOrder();*/

        //Excercise 2

        Human h1  = new Human("Luciano");
        Dog d1 = new Dog("Clifford");
        Robot r1 = new Robot("Alexa");

        List<Competitor> comp1 = new ArrayList<Competitor>();
        comp1.add(h1);
        comp1.add(d1);
        comp1.add(r1);

        Marathon m1 = new Marathon((double) 10,comp1);





    }
}
