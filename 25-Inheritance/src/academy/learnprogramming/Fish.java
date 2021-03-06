package academy.learnprogramming;

public class Fish extends Animal{
    private int gils;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gils, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gils = gils;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }
    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() called");

    }
    private void moveBackFin(){
        System.out.println("Fish.moveBackFin() called");
    }
    public void swim(int speed){
        this.moveMuscles();
        this.moveBackFin();
        super.move(speed);
    }
}
