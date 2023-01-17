package org.example.observer;

public class DataSource extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        // we can use push style -> pass the value in notifyObservers method
        this.value = value;
        notifyObservers();
    }
}
