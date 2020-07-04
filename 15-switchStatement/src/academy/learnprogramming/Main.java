package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 1;

        // Switch values are confined to the value of its argument
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("Acutally it was " + switchValue);
                break;
            // if statement missing 'break' it will continue to the next case
            default:
                System.out.println("Value not 1 or 2");
        }

        //Char data types can only use '. Using " will throw errors.
        char letter = 'A';

        switch (letter) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Letter " + letter + " was found.");
                break;
            default:
                System.out.printf("Not found");
        }


    }
}
