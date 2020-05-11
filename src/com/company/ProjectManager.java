package com.company;

import java.util.Map;

public class ProjectManager {

    private String name;
    private int age;
    private Map subordinates;
    private String favLanguage;

    public ProjectManager() {
    }

    public ProjectManager(String name, int age, Map subordinates, String favLanguage) {
        this.name = name;
        this.age = age;
        this.subordinates = subordinates;
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

    public Map getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Map subordinates) {
        this.subordinates = subordinates;
    }

    public void addSubordinates(String category, Integer amount) {
        this.subordinates.put(category, amount);
    }

    public void showSubordinates() {
        if (this.subordinates.isEmpty()) {
            System.out.println("No subordinate added yet");
        } else {
            for (Object key : this.subordinates.keySet()) {
                Object value = this.subordinates.get(key);
                System.out.println("Key: " + key + " , value: " + value);
            }
        }
    }

    public Integer getSubordiantesAmount(String category) {
        if (this.subordinates.isEmpty()) {
            System.out.println("No subordinate added yet");
            return null;
        } else {
            for (Object key : this.subordinates.keySet()) {
                Object value = this.subordinates.get(key);
                if (this.subordinates.containsKey(category)) {
                    System.out.println("Category " + category + " has => " + this.subordinates.get(category) + " subordinates");
                    return (Integer) this.subordinates.get(category);

                }
            }
        }
        System.out.println("Invalid category");
        return null;
    }

    public void removeCategory(String category) {
        if (this.subordinates.isEmpty()) {
            System.out.println("No subordinate added yet");
        } else {
            if (this.subordinates.containsKey(category)) {
                this.subordinates.remove(category);
                System.out.println("New map => " + this.subordinates );
            }
        }
    }

    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subordinates=" + subordinates +
                ", favLanguage='" + favLanguage + '\'' +
                '}';
    }
}
