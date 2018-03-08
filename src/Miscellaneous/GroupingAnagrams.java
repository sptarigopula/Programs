package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by starigopula on 2/6/2018.
 */
public class GroupingAnagrams {

    public static void main(String args[]){

        String[] strings = new String[]{"art","tar","madam","dam","rat","damam"};

        GroupingAnagrams g = new GroupingAnagrams();
        g.groupAnagrams(strings);
    }

    public void groupAnagrams(String[] strings){

        if(strings.length == 0 || strings == null || strings.length<2){
            System.out.println("Invalid arguments");
        }

        HashMap<String,ArrayList<String>> list = new HashMap<String, ArrayList<String>>();

        for(String s : strings){
            String sorted = sortString(s);
            if(list.containsKey(sorted)){
                list.get(sorted).add(s);
            }
            else{
                ArrayList<String> a = new ArrayList<String>();
                a.add(s);
                list.put(sorted,a);
            }
        }
        printGroupAnagrams(list);
    }

    public String sortString(String s){

        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public void printGroupAnagrams(HashMap<String,ArrayList<String>> list){
         if(list.isEmpty() || list.size() == 0 || list ==  null){
             System.out.println("There are no anagrams to print");
         }

         else {
             for( String k : list.keySet()){
                 ArrayList<String> groupAnagrams = list.get(k);
                 for(String anagram : groupAnagrams){
                     System.out.print(anagram+" ");
                 }
             }
         }
    }
}
