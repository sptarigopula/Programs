package Miscellaneous;

/**
 * Created by starigopula on 2/4/2018.
 */
public class PrintNumbers {

    public static void main(String args[]){

        int number = 10;

        for(int i = 1, j = 1; i < 11 ; j++){
            for(int k = 0; k < j; k++) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
    }
}
