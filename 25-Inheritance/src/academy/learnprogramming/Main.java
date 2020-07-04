package academy.learnprogramming;

import com.sun.tools.javac.file.FSInfo;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"Long Silky");

        Fish fish = new Fish("Bass",1,2,2,2,2);


        dog.eat();
        // ^^^
        // At first this was called through the Animal class.. Until an override was put into the Dog class
        // Now it's called through the dog class and the method calls chew() and super.eat().
        // super.eat() is the parent eat() from the animal class.
        // this is because the dog class extends the animal class.

//        dog.walk();
        dog.run();
        








    }
}
