package com.carproject.parts;

public class Wheel {
    private double size;

    public void setSize(double size) {
        if (size <= 0) {
            throw new InvalidPartException("Wheel size must be greater than 0!");
        }
        this.size = size;
    }

    public double getSize() { return size; }
}