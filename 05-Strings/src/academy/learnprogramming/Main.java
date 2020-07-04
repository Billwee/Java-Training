package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Strings are not primitive types it's actually a class

        // Strings in Java are immutable meaning you can't change a string after it's created,
        // what happens is a new string is created.

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2020";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);



    }
}
