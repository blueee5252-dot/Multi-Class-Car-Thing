package com.carproject.parts;

public class Engine {
    private int horsepower;

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int hp) {
        if (hp <= 0) {
            throw new InvalidPartException("Engine horsepower must be a positive number!");
        }
        this.horsepower = hp;
    }
}