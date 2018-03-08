package Miscellaneous;

/**
 * Created by starigopula on 2/14/2018.
 */
public class RotationalStrings {
    public static void main(String args[]){
        String strings[] = new String[]{"abcd","dabc"};
        System.out.println(areRotationalStrings(strings));
    }

    public static boolean areRotationalStrings(String[] strings){
        String s1 = strings[0];
        String s2 = strings[1];

        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty() || s1 ==null || s2 ==null){
            return false;
        }

        String temp = s1+s1;

        if(temp.contains(s2)){
            return true;
        }

        return false;
    }
}
