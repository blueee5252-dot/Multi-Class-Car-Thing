package com.carproject.main;

import com.carproject.parts.*; // grabs the engine wheel and others
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter Engine Horsepower: ");
            int hp = Integer.parseInt(input.nextLine());
            Engine myEngine = new Engine();
            myEngine.setHorsepower(hp);

            System.out.print("Enter Battery Capacity (kWh): ");
            int cap = Integer.parseInt(input.nextLine());
            Battery myBattery = new Battery();
            myBattery.setCapacity(cap);

            System.out.print("How many wheels does this car have? ");
            int wheelCount = Integer.parseInt(input.nextLine());
            Wheel[] myWheels = new Wheel[wheelCount];
            
            for (int i = 0; i < wheelCount; i++) {
                myWheels[i] = new Wheel();
                myWheels[i].setSize(18.0);
            }

            Car myCar = new Car(myEngine, myWheels, myBattery);
            
            myCar.showResults();

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter numbers only!");
        } catch (InvalidPartException e) {
            System.out.println("Part Error: " + e.getMessage());
        } catch (AssemblyException e) {
            System.out.println("Assembly Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            input.close();
            System.out.println("Program finished.");
        }
    }
}