package com.company;

import java.util.Set;

public class ScrumMaster {

    private String name;
    private int age;
    private Set tasks;
    private String favLanguage;

    public ScrumMaster() {
    }

    public ScrumMaster(String name, int age, Set tasks, String favLanguage) {
        this.name = name;
        this.age = age;
        this.tasks = tasks;
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

    public Set getTasks() {
        return tasks;
    }

    public void setTasks(Set tasks) {
        this.tasks = tasks;
    }

    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tasks=" + tasks +
                ", favLanguage='" + favLanguage + '\'' +
                '}';
    }
}
