package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        // Operators are things like +, -, *, =
        // Operands are the arguments in the expression

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println(" 3 - 1 = " + result);
        System.out.println("Previous result = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +  2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // IF-THEN STATEMENTS
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I'm afraid of aliens");
        }

        int topScore = 100;
        if(topScore != 100) {
            System.out.println("You got the high score!");
        }

        // Ternary operator - In Java they only seem to assign boolean values to variables
        boolean isCar = false;

        boolean wasCar = isCar ? true : false;
        // isCar is false to wasCar is assigned the value false

        if (wasCar) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }
        System.out.println(wasCar);


        double twenty = 20.00d;
        double eighty = 80.00d;
        double sum = (twenty + eighty) * 100.00d;
        double remainder = sum % 40.00d;

        boolean remainderZero = (remainder == 0) ?  true : false;

        System.out.println("Remainder zero? " + remainderZero);

        if(!remainderZero){
            System.out.println("Got some remainder");
        }








    }
}
