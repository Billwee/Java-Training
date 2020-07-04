package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //INT VARIABLE TYPE - Occupies 32 bits - width of 32
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); //OVERFLOW
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); //UNDERFLOW

        // int myMaxIntTest = 2147483648; <- Too big, will error

        int numberFormatting = 2_147_483_647; // Works for readability


        //BYTE VARIABLE - Occupies 8 bits - width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //SHORT VARIABLE - Occupies 16 bits - width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //LONG VALUE - Occupies 64 bits = width of 64
        // Place capital "L" after number
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        // long bigLongLiteralValue = 2_147_483_647_234; <- throws error without "L"
        // Default is INT for Java.

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue /2);
        // This is casting     ^  you have tell java to treat it as a byte it's defaulting to int

        short myNewShortValue = (short)(myMinShortValue / 2);
        // Same here .. have to specify type when not an int

        //CHALLENGE FROM LECTURE 27
        byte byteChallenge = 100;
        short shortChallenge = 20_000;
        int intChallenge = 1_000_000_000;
        long longChallenge = 50000L + (10 * (byteChallenge + shortChallenge + intChallenge));

        System.out.println(longChallenge);



    }
}
