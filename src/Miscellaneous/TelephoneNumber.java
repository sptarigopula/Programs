package Miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Created by starigopula on 2/9/2018.
 */
public class TelephoneNumber {
    public static final HashMap<Character,String> map = new HashMap<Character, String>(){
        {
            put('1',"1");
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
            put('0',"0");
        }
    };

    public static List<String> combinations(String phoneNumber , HashMap<Character,String> map) {
        if(phoneNumber.isEmpty()){
            return new ArrayList<String>();
        }

        List<String> result = new ArrayList<String>();
        result.add("");

        for (int i = 0; i < phoneNumber.length() ; i++) {
            String letters = map.get(phoneNumber.charAt(i));
            List<String> nextResult = new ArrayList<String>();
            for(String str : result){
                for(int j =0 ; j<letters.length() ; j++){
                    nextResult.add(str+letters.charAt(j));
                }
            }
            result = nextResult;
        }
        return result;
    }

    public static void main(String args[]){
        String phoneNumber = "9866671881";
        List<String> result = combinations(phoneNumber,map);
        for( String r : result){
            System.out.print(r+" ");
        }
    }
}
