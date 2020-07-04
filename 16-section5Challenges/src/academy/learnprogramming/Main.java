package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        printDayOfTheWeek(2);

        int sum = 0;
        int total = 0;
        int limit = 100;
//        for(int i = 1; i <= limit; i++){
//            if((i % 3 == 0) && (i % 5 ==0)){
//                System.out.println(i + " is divisible by 3 and 5.");
//                sum += i;
//                total++;
//            }
//            if(total == 5){
//                System.out.println(sum + " is the sum of all 5 numbers");
//                break;
//            }
//        }

        System.out.println("Sum of digits = " + sumDigits(125));
        System.out.println("Sum of digits = " + sumDigits(4));
        System.out.println("Sum of digits = " + sumDigits(-125));
        System.out.println("Sum of digits = " + sumDigits(32123));


    }

    //Day of the week challenge
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;

        }
    }


//public class NumberOfDaysInMonth {
//    public static boolean isLeapYear(int year){
//        if(year < 1 || year > 9999){
//            return false;
//        }
//        if (year % 4 == 0){
//            if(year % 100 != 0){
//                return true;
//            }else{
//                return false;
//            }
//        }else if(year % 400 == 0){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    public static int getDaysInMonth(int month, int year){
//        if(month < 1 || month > 12 || year < 1 || year > 9999){
//            return -1;
//        }
//
//
//        switch (month){
//            case 0:
//            case 2:
//            case 4:
//            case 6:
//            case 7:
//            case 9:
//            case 11:
//                return 31;
//            case 1:
//                if(isLeapYear(year)){
//                    return 29;
//                }else{
//                    return 28;
//                }
//            case 3:
//            case 10:
//            case 5:
//            case 8:
//                return 30;
//            default:
//                return -1;
//
//        }
//
//
//    }
//}

//Digit Sum Challenge

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int newNumber = number;
        int digit = 0;
        int sum = 0;
        while (newNumber != 0) {
            digit = newNumber % 10;
            sum += digit;
            newNumber /= 10;
        }

        return sum;
    }


//End of main
}

