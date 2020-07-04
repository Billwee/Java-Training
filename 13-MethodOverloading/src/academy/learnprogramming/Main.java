package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Bill", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
//        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(534));


    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " +  score + " points.");
        return score * 1000;
    }
    // Create the same method with different argument number or types
    // Each method is unique based on the amount and type of arguments. Names mean nothing
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " +  score + " points.");
        return score * 1000;
    }

//    public static int calculateScore(){
//        System.out.println("No player name, no player score");
//        return score * 1000;
//    }

    // Different return types don't matter either. Will error
//    public static void calculateScore(){
//        System.out.println("No player name, no player score");
//    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if( feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        int totalInches = (feet * 12) + inches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches < 0){
            return -1;
        }
        int totalFeet = inches / 12;
        System.out.println(totalFeet);
        int totalInches = inches % 12;
        System.out.println(totalInches);
        return calcFeetAndInchesToCentimeters(totalFeet, totalInches);
    }




}
