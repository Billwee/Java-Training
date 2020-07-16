package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};

        reverse(array);

    }
    public static void reverse(int[] array){
        System.out.println(Arrays.toString(array));
        //Not going by half length of the array will loop through the first
        //half and reverse it then go through the second half and put it back in place... lolz
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - (i+1)];
            array[array.length - (i+1)] = temp;
        }
        System.out.println(Arrays.toString(array));


    }
}
