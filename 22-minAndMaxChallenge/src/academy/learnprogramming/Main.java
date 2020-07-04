package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean initialValue = true;



//        while (true) {
//
//            System.out.println("Enter Number: ");
//
//            boolean isInt = scanner.hasNextInt();
//
//            if (!initialValue && isInt) {
//                int number = scanner.nextInt();
//                if (number > max) {
//                    max = number;
//                }
//                if (number < min) {
//                    min = number;
//                }
//            } else if (initialValue && isInt) {
//                int number = scanner.nextInt();
//                max = number;
//                min = number;
//                initialValue = false;
//            } else {
//                break;
//            }
//
//            scanner.nextLine();
//            System.out.println("Max = " + max + " - Min = " + min);
//        }
//
//        System.out.println("Invalid number entered - Entry closed.");
////        scanner.close();
inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter  = 0;
        int average = sum;
        while(true){
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }else{
                break;
            }
            scanner.nextLine();
        }
        long avg = Math.round((double)sum/counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);

    }
}
