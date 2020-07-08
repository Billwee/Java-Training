package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int length;


    public static void main(String[] args) {

       getLength();

       int[] myIntegers = getIntegers(length);

       int[] sortedIntegers = sortIntegers(myIntegers);

       System.out.println("Unsorted array: " + Arrays.toString(myIntegers));
       System.out.println("Sorted array: " + Arrays.toString(sortedIntegers));

    }
    public static int getLength() {
        System.out.println("Enter array length");
        length = scanner.nextInt();
        return length;
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " numbers");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static int[] sortIntegers(int[] array){
        int[] unsorted = array;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < unsorted.length - 1; j++){
                int number = unsorted[j];
                if(unsorted[j] > unsorted[j+1]){
                    continue;
                }else{
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j+1] = number;
                }
            }
        }
        return unsorted;
    }

}
