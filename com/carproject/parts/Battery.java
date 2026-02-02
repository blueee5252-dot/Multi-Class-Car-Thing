package com.carproject.parts;

public class Battery {
    private int capacity; // this is kWh

    public void setCapacity(int capacity) {
        if (capacity <= 0) throw new InvalidPartException("Battery capacity must be positive!");
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }
}