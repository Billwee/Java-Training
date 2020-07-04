package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // If only one return then no braces are needed
//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 and more than 1000");
//        }else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        }else{
//            System.out.println("Got here");
//        }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //CHALLENGE
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;
        if(gameOver){
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}
