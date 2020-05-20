package com.company.excercise5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Car {

    private String model;
    private Integer price;

    public Car() {
    }

    public Car(String model, Integer price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.toLowerCase();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void cleanDuplicates(List<Car> duplicateList){
        Set<Car> nonDuplicates = new HashSet<Car>(duplicateList);
        duplicateList.clear();
        duplicateList.addAll(nonDuplicates);

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
