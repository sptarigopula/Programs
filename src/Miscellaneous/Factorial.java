package Miscellaneous;

/**
 * Created by starigopula on 2/14/2018.
 */
public class Factorial {
    public static void main(String args[]){
        int number = 5;
        System.out.println(getFactorial(number));
    }

    public static int getFactorial(int number){
        int factorial = 1;
        for(int i =1;i<=number;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
