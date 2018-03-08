package Miscellaneous;

/**
 * Created by starigopula on 2/10/2018.
 */
public class NumberPalindrome {

    public static void main(String args[]) {
        int number = 1213;
        NumberPalindrome n = new NumberPalindrome();
        System.out.println(n.isNumberPalindrome(number));
    }

    public boolean isNumberPalindrome(int number){

        if(number == 0 || number%10 == 0 || number < 0){
            return false;
        }

        int revertedNumber = 0;

        while(number > revertedNumber){
            revertedNumber = revertedNumber * 10 + number % 10;
            number = number / 10;
        }

        return number == revertedNumber || number == revertedNumber /10;
    }
}
