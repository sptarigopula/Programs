package Miscellaneous;

/**
 * Created by starigopula on 2/13/2018.
 */
public class ArmstrongNumber {
    public static void main(String args[]){
        //armstrong number - 371 - 3^3 + 7^3 + 1^3 =
        int number = 371;
        System.out.println(isArmstrongNumber(number));
    }

    public static boolean isArmstrongNumber(int number){
        String numberToString = Integer.toString(number);
        char[] numberArray = numberToString.toCharArray();
        int numbersSize = numberToString.length();
        int sum = 0;
        for(int i =0 ; i< numbersSize;i++){
            sum += Math.pow(Character.getNumericValue(numberArray[i]),numbersSize);
        }

        return sum==number?true:false;
    }
}
