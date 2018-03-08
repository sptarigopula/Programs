package Miscellaneous;

import java.util.HashMap;

/**
 * Created by starigopula on 2/6/2018.
 */
public class IntegerToRoman {
    public static void main(String args[]){

        /*Questions to ask?
        Are we assuming that the integer value is between 1 and 3999?
        Any number above 3999 is considered as a Big Number and is represented with a bar notation
         */
        int number = 1587;
        //I - One , V - Five , X - Ten , L - Fifty , C - Hundred , D - Five Hundred , M - Thousand
        String M[] = {"","M","MM","MMM"};
        String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};

        System.out.println(M[number/1000] + C[(number%1000)/100] + X[(number%100)/10] + I[number%10]);
    }
}
