package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        // Just like JS.. arrays start at 0
        // Unlike JS.. arrays in Java can only contain one datatype


        //Defined like this
        int[] myVariable;
        myVariable = new int[10];

        // Or like this
        int[] myIntArray = new int[10];
        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
        int[] myLoopArray = new int[10];
        double[] myDoubleArray = new double[10];

        //Setting values in a loop
        for(int i = 0; i < myLoopArray.length; i++){
            myLoopArray[i] = i*10;
            System.out.println(myLoopArray[i]);
        }

        //Passing an array as a method
        //Remember.. char values must be surrounded in '' - using "" will throw error
        char[] myMethodArray = {'A', 'G', 'T', 'Y', 'R', 'X'};
        printArray(myMethodArray);

        //Using user input to fill array and print average
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }
    public static void printArray(char[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    //This method creates an array named "values" and sets it's length to the parameter "number"
    //then uses a for loop with a scanner to insert values into it's indexes
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
