package com.company;

import java.util.ArrayList;
import java.util.List;

public class Programmer {

    private String name;
    private int age;
    private List knownTechnologies;
    private String favLanguage;

    public Programmer() {
    }

    public Programmer(String name, int age, List knownTechnologies, String favLanguage) {
        this.name = name;
        this.age = age;
        this.knownTechnologies = knownTechnologies;
        this.favLanguage = favLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getKnownTechnologies() {
        return knownTechnologies;
    }

    public void showKnowTechnologies() {

        System.out.println("Know technologies of " + this.getName() + ":");
        for (int i = 0; i < this.knownTechnologies.size(); i++) {
            System.out.println("* " + this.knownTechnologies.get(i));
        }
    }

    public void invertTechnologyOrder() {

        ArrayList pawn = new ArrayList<String>();
        while (!(this.knownTechnologies.isEmpty())) {
            pawn.add(0, this.knownTechnologies.get(0));
            this.knownTechnologies.remove(0);
        }
        setKnownTechnologies(pawn);
    }

    public void addTechnologyToList(String technology) {
        String pawn;
        pawn = technology.toLowerCase();
        this.knownTechnologies.add(pawn);
    }

    public String getOneTechnology(String searchElement) {
        if (!(this.knownTechnologies.isEmpty())) {
            if (this.knownTechnologies.contains(searchElement)) {
                return searchElement;
            } else {
                return "Element not present in list";
            }
        } else {
            return "List has no elements";
        }

    }

    public void removeOneTechnology(String removed) {
        String pawn;
        pawn = removed.toLowerCase();
        if (this.knownTechnologies.isEmpty()) {
            System.out.println("List has no elements");
        } else {
            if (this.knownTechnologies.contains(pawn)) {
                this.knownTechnologies.remove(pawn);
                System.out.println("Element removed successfully");
                System.out.println(this.knownTechnologies);
            }
        }
    }

    public void setKnownTechnologies(List knownTechnologies) {
        this.knownTechnologies = knownTechnologies;
    }

    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", knownTechnologies=" + knownTechnologies +
                ", favLanguage='" + favLanguage + '\'' +
                '}';
    }
}
