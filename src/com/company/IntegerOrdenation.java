package com.company;


import java.util.Collections;
import java.util.List;

public class IntegerOrdenation {

    private List<Integer> intCollection;

    public IntegerOrdenation(List<Integer> intCollection) {
        this.intCollection = intCollection;
    }

    public List<Integer> getIntCollection() {
        return intCollection;
    }

    public void setIntCollection(List<Integer> intCollection) {
        this.intCollection = intCollection;
    }

    public void sortIntegers(List<Integer> unorderedInt) {
        Collections.sort(unorderedInt);
        setIntCollection(unorderedInt);
    }

    @Override
    public String toString() {
        return "IntegerOrdenation{" +
                "intCollection=" + intCollection +
                '}';
    }
}
