package Miscellaneous;

/**
 * Created by starigopula on 2/13/2018.
 */
public class FibonacciSeries {
    public static void main(String args[]){
        int number = 20;
        int fibCurrent = 1;
        int fibPrev = 1 ;
        System.out.print("0 1 1 ");
        for(int i =2 ; i< number ; i++){
            int temp  = fibCurrent;
            fibCurrent = fibCurrent+fibPrev;
            fibPrev = temp;
            System.out.print(fibCurrent + " ");
        }
    }
}
