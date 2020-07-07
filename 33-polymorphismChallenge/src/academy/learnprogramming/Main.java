package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //Testing Car class
        Car car = new Car(8,"Default");
        car.startEngine();
        car.accelerate();
        car.brake();

        //Testing Subaru class
        Subaru subaru = new Subaru();
        subaru.startEngine();
        subaru.accelerate();
        subaru.brake();

        //Testing Ford class
        Ford ford = new Ford();
        ford.startEngine();
        ford.accelerate();
        ford.brake();

    }
}

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }
    public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }
    public void startEngine(){
        System.out.println("Car: Engine has started");
    }
    public void accelerate(){
        System.out.println("Car: Accelerating");
    }
    public void brake(){
        System.out.println("Car: Brakes applied");
    }
}

class Mitsubishi extends Car {
    public Mitsubishi() {
        super(4, "Lancer");
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi: Engine has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi: Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi: Brakes applied");
    }
}

class Subaru extends Car {
    public Subaru() {
        super(4, "WRX");
    }

    @Override
    public void startEngine() {
        System.out.println("Subaru: Engine has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Subaru: Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Subaru: Brakes applied");
    }
}

class Ford extends Car {
    public Ford() {
        super(8, "Mustang");
    }

    @Override
    public void startEngine() {
        System.out.println("Ford: Engine has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford: Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ford: Brakes applied");
    }
}
