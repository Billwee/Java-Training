package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        // Running this part will accept data for the newly sized array
//        System.out.println("Enter 12 integers:");
//        getInput();
//        baseData[10] = 67;
//        baseData[11] = 34;
        // Prints the array after resizing
        printArray(baseData);

    }

    private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    private static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    //This function will take the original [10] array and make a new instance of it
    //with a copy. Then it redefines the original array as a [12]. Afterwards it takes
    // the original values from the copy and inserts them into the new original array instance.
    //
    private static void resizeArray()
    {
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }

}
