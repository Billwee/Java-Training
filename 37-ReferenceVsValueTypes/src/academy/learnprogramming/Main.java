package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        //Arrays are reference types - they hold values which you route to
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        //Both are changed because both arrays are pointing to the same spot in memory
        //That's what reference types are.
        System.out.println("(After change) myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("(After change) anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        //Now there are 3 references to the same array. The method does the same thing
        System.out.println("(After function) myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("(After function) anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]  {4,5,6,7,8};
        modifyArray(myIntArray);

        //Now anotherArray has it's own reference so outputs won't match anymore
        System.out.println("(After function + new change) myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("(After function + new change) anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        //This creates a reference to a completely new array. It doesn't change the original reference
        array = new int[] {1,2,3,4,5};
    }
}
