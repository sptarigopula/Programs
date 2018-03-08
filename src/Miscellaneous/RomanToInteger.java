package Miscellaneous;

import java.util.HashMap;

/**
 * Created by starigopula on 2/6/2018.
 */
public class RomanToInteger {
    public static void main(String args[]){

        /*Questions to ask -
        Are we given a valid Roman Number?
         */
        String roman ="XI";
        HashMap<Character,Integer> mapping= new HashMap<Character, Integer>();

        mapping.put('I', 1);
        mapping.put('V',5);
        mapping.put('X',10);
        mapping.put('L',50);
        mapping.put('C',100);
        mapping.put('M',1000);

        if(roman.isEmpty() || roman == null ){
            System.out.println("Invalid value");
        }
        else{
            int sum = 0;
            for(int i = roman.length()-1;i>=0;i--){
                if(i == roman.length()-1){
                   sum += mapping.get(roman.charAt(i));
                   continue;
                }
                if(mapping.get(roman.charAt(i)) < mapping.get(roman.charAt(i+1))){
                    sum -= mapping.get(roman.charAt(i));
                }else{
                    sum += mapping.get(roman.charAt(i));
                }
            }
            System.out.println(sum);
        }
    }
}
