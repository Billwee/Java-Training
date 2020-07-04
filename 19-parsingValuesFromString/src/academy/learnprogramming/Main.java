package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        System.out.println(canPack(1, 0, 6));



    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        System.out.println(bigCount);
        System.out.println(smallCount);
        System.out.println(goal);

        for (int i = bigCount; i > 0; i--) {

            if (goal >= 5) {
                goal -= 5;
            } else {
                break;
            }
        }
        for (int j = smallCount; j > 0; j--) {
            if (goal > 0) {
                goal -= 1;
            } else break;
        }
        return goal <= 0;


    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }

        


    }


}


