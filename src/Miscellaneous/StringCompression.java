package Miscellaneous;

/**
 * Created by starigopula on 2/6/2018.
 */
public class StringCompression {

    public static void main(String args[]){

        String s = "aaabbbbbccdddeef";
        if(s.isEmpty() || s==null || s.length()<2){
            System.out.println("Invalid String");
        }else {
            StringCompression sc = new StringCompression();
            sc.getStringCharCount(s);
        }
    }

    public void getStringCharCount(String s){

        StringBuilder sb = new StringBuilder();

        int countConsecutive = 0;

        for(int i = 0 ; i<s.length() ; i++){

            countConsecutive ++;

            if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                sb.append(s.charAt(i));
                sb.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        System.out.println( sb.length() < s.length() ? sb : s);
    }
}
