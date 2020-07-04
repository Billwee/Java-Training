package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	//Float occupies 32 bits or has a width of 32
    //Double occupies 64 bits or has a width of 64

        //FLOAT NUMBERS
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloat);
        System.out.println("Float maximum value = " + myMaxFloat);

        //DOUBLE NUMBERS
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDouble);
        System.out.println("Double maximum value = " + myMaxDouble);

//        int myIntValue = 5;
//        float myFloatValue = (float) 5.25;
//        // floats need casting. double is the default value
//        // You can also put a "f" after the number instead of casting - 5.25f
//        double myDoubleValue = 5d;

        int myIntValue = 5 / 3; // 1
        float myFloatValue = 5f / 3f; // 1.6666666
        double myDoubleValue = 5d / 3d; // 1.6666666666666667
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kilogramConversion = pounds * 0.45359237d;
        System.out.println(pounds +"lbs = " + kilogramConversion + "kg");






    }
}
