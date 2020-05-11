package com.company.excercise1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
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

    public void addTask(String task) {
        this.tasks.add(task.toLowerCase());
    }

    public void removeTask(String task) {
        if (this.tasks.isEmpty()) {
            System.out.println("No tasks added yet");
        } else {
            if (this.tasks.contains(task.toLowerCase())) {
                this.tasks.remove(task.toLowerCase());
            }
        }
    }

    public void showAllTasks() {

        if (this.tasks.isEmpty()) {
            System.out.println("No tasks added yet");
        } else {
            for (Object tsk : this.tasks) {
                System.out.println("Task => " + tsk);
            }
        }
    }

    public void invertTaskOrder() {
        Object[] asArray = this.tasks.toArray();
        Set<String> pawn = new LinkedHashSet<String>();
        for (int i = asArray.length - 1; i >= 0; i--) {
            pawn.add((String) asArray[i]);
        }
        setTasks(pawn);
        System.out.println("Inverted order => " + this.tasks);
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
