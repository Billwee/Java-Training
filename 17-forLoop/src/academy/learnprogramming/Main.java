package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("$10000 at 2% interest = " + calculateInterest(10000,2));

        for(int i = 1; i < 11; i++){
            System.out.println("$10000 at " + i +"% interest = " + String.format("%.2f", calculateInterest(10000,i)));
            //String.format("%.2f", number) - takes number and shows 2nd decimal place.
        }

        int limit = 0;
        for (int i = 7; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a Prime number");
                limit++;
                if(limit == 10){
                    System.out.println("Found " + limit + " Prime numbers");
                    break;
                }
            }
        }



    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
