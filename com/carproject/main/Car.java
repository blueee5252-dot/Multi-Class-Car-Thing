package com.carproject.main;

import com.carproject.parts.Engine;
import com.carproject.parts.Wheel;
import com.carproject.parts.Battery;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private Battery battery;

    public Car(Engine engine, Wheel[] wheels, Battery battery) throws AssemblyException {
        if (wheels == null || wheels.length == 0) {
            throw new AssemblyException("The wheels array must not be empty!");
        }
        
        if (engine == null || battery == null) {
            throw new AssemblyException("Missing engine or battery!");
        }

        this.engine = engine;
        this.wheels = wheels;
        this.battery = battery;
    }

    public void showResults() {
        System.out.println("Success! The car is ready.");
        System.out.println("Engine Power: " + engine.getHorsepower() + " HP");
        System.out.println("Number of Wheels: " + wheels.length);
        System.out.println("Battery Capacity: " + battery.getCapacity() + " kWh");
    }
}