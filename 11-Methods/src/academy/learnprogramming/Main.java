package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        calculateScore(gameOver, score, levelCompleted, bonus);

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

//        calculateScore(true, 10000,8,200);

        highScore = calculateScore(true, 10000,8,200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Bill", calculateHighScorePosition(1500));
        displayHighScorePosition("Bill", calculateHighScorePosition(900));
        displayHighScorePosition("Bill", calculateHighScorePosition(400));
        displayHighScorePosition("Bill", calculateHighScorePosition(50));

    }

    // void means don't return anything back
    // changing it to a datatype will tell it what to return - like int
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        //One way
//        if(score >= 1000){
//            return 1;
//        }else if(score >= 500){
//            return 2;
//        }else if(score >= 100){
//            return 3;
//        }
//        return 4;

        //Another way with less returns
        int position = 4; // assuming position 4 will be returned
        if(score >= 1000){
            position = 1;
        }else if(score >= 500) {
            position = 2;
        }else if(score >= 100){
            position = 3;
            }

        return position;


    }
}
