package Miscellaneous;

import java.util.HashMap;

/**
 * Created by starigopula on 2/10/2018.
 */
public class IsomorphicString {
    public static void main(String args[]){
        String s1 = "egg";
        String s2 = "ddd";
        IsomorphicString i = new IsomorphicString();
        System.out.println(i.isIsomorphic(s1,s2));
    }

    public boolean isIsomorphic(String s1, String s2){

        if(s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty() || s1 == null || s2 == null){
            return false;
        }

        boolean isIsomorphic = true;
        char[] s1CharArray = s1.toCharArray();
        char[] s2CharArray = s2.toCharArray();
        HashMap<Character,Character> characterMapping = new HashMap<Character, Character>();
        for(int i =0 ; i < s1.length() ;i++) {
            if (characterMapping.containsKey(s1CharArray[i])) {
                if (characterMapping.get(s1CharArray[i]) == s2CharArray[i]) {
                    continue;
                } else {
                    isIsomorphic = false;
                    break;
                }
            } else {
                for( char a : characterMapping.keySet()){
                    if(characterMapping.get(a) == s2CharArray[i]){
                        isIsomorphic = false;
                        break;
                    }
                }
                characterMapping.put(s1CharArray[i], s2CharArray[i]);
            }
        }
        return isIsomorphic;
    }
}
