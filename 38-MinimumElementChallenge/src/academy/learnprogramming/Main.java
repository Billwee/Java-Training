package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count;

        System.out.println("Enter length of your array");
        count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);

        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Lowest value in the array = " + findMin(array));



    }
    public static int[] readIntegers(int count){
        // Tried to think of some kind of validation... didn't work
//        if(count < 1){
//            System.out.println("Invalid number");
//            return int[] array = {}
//        }
        System.out.println("Please enter " + count + " integer(s)");
        int[] array = new int[count];

        for(int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int lowest = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                lowest = array[i];
            }
            if(array[i] < lowest){
                lowest = array[i];
            }
        }
        return lowest;
    }
}
