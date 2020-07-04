package academy.learnprogramming;

public class Vehicle {
    private String name;
    private String size;
    private int handSteering;
    private int windows;
    private int lights;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size, int handSteering, int windows, int lights) {
        this.name = name;
        this.size = size;
        this.handSteering = handSteering;
        this.windows = windows;
        this.lights = lights;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getHandSteering() {
        return handSteering;
    }

    public int getWindows() {
        return windows;
    }

    public int getLights() {
        return lights;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

