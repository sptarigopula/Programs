package LeetCode;

import java.util.ArrayList;

/**
 * Created by starigopula on 2/17/2018.
 */
public class ThreeLetterCombinationsOfWord {
    public static void main(String args[]){
        String word = "123456789";
        int lettersInCombination = 3;
        ArrayList<String> combination = new ArrayList<String>();
        getLetterCombinations(word,lettersInCombination);
    }

    public static void getLetterCombinations(String word , int lettersCount){
        ArrayList<String> combination = new ArrayList<String>();
        char[] wordArray = word.toCharArray();
        combination.add("");
        for(int i =0;i<wordArray.length;i++){
            ArrayList<String> result = new ArrayList<String>();
                for(String str : combination){
                    for(int j =0;j<lettersCount;j++){
                       combination.add(str+wordArray[j]);
                    }
                }
            combination = result;
        }
        combination.get(0);
    }
}
