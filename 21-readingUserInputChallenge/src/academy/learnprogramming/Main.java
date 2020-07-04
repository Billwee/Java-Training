package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while(counter <= 10){

            System.out.println("Enter number " + counter);

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                counter++;
                int number = scanner.nextInt();
                sum += number;
            }else{
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // handles end of line (enter key)

        }

        System.out.println("The sum of all 10 numbers is: " + sum);
        scanner.close();

    }
}

