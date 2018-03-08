package Miscellaneous;

import java.util.Arrays;

/**
 * Created by starigopula on 2/6/2018.
 */
public class PrintTheNumbersOfAParticularSum {

    public static void main(String ags[]){

        int numbers[] = new int[]{1,3,3,4,4,6};
        Arrays.sort(numbers);

        PrintTheNumbersOfAParticularSum print = new PrintTheNumbersOfAParticularSum();
        int sumRequired = 7;
        print.getPairs(numbers,sumRequired);

    }

    public void getPairs(int[] numbers,int sumRequired){

        if( numbers != null || numbers.length < 2 ){
            System.out.println("Invalid");
        }

        int first = 0;
        int last = numbers.length-1;


        while(first<last){

            int sum = numbers[first] + numbers[last];

            if(sum == sumRequired){
                System.out.println("["+numbers[first]+","+numbers[last]+"]");
                last --;
            }

            if(sum > sumRequired){
                last--;
            }else if(sum < sumRequired){
                first++;
            }
        }
    }
}
