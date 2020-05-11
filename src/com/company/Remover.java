package com.company;

import java.util.List;

public class Remover {


    public List stringCollection;

    public Remover() {
    }

    public Remover(List stringCollection) {
        this.stringCollection = stringCollection;
    }

    public List getStringCollection() {
        return stringCollection;
    }

    public void setStringCollection(List stringCollection) {
        this.stringCollection = stringCollection;
    }

    public void removeEvenLength() {

        String pawn = null;

        for (int i = 0; i < this.stringCollection.size(); i++) {
            pawn = (String) this.stringCollection.get(i);
            if (pawn.length() % 2 == 0) {
                this.stringCollection.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Remover{" +
                "stringCollection=" + stringCollection +
                '}';
    }
}
