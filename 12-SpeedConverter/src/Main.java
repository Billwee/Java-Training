public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        System.out.println(num1 * 1000);
        System.out.println(num2 * 1000);
        if((int)num1 * 1000 == (int)num2 * 1000){
            return true;
        }else{
            return false;
        }
    }
}
