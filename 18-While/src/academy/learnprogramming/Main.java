package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 1;

        while(count != 6) {
            System.out.println("Count value is  " + count);
            count++;
        }

        // The difference between a while and a do/while loop is that a do while will always
        // execute at least once, then check it's break conditional. This can lead to overflow problems.
        // for example.. if 'count' below was set to six it would still execute once, increment it to seven, and
        // never hit it's break conditional.. causing overflow.
        // This can be avoided by putting a break conditional in the do statement.
        //Do/While loops require a semi-colon after the while statement
        count = 1;
        do{
            System.out.println("Count value is  " + count);
            count++;
        } while(count != 6);

        int number =4;
        int finishNumber = 20;
        int totalEven = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;  // restarts the loop
            }
            totalEven++;
            System.out.println("Even number " + number);
            if(totalEven == 5){
                System.out.println(totalEven + " even numbers found.");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
