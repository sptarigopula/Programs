package Miscellaneous;

/**
 * Created by starigopula on 2/4/2018.
 */
public class PrimeNumber {

    public static void main(String args[]){

        int number = 13;

        for(int i=2;i<=Math.sqrt(25);i++){
            int remainder = number % i;

            if(remainder == 0){
                System.out.println("False");
                break;
            }

        }
    }
}
