package Miscellaneous;

/**
 * Created by starigopula on 2/6/2018.
 */
public class PalindromeString {

    public static void main(String args[]){
        String s = "m";
        int length = s.length()-1;
        int i;

        if(s == null || s.length() < 2){
            System.out.println("Invalid comparison");
        }
        else {
            for (i = 0; i < length; i++) {
                if (s.charAt(i) != s.charAt(length - i)) {
                    break;
                }
            }
            System.out.println(i== s.length()-1 ? "Yes.It is a palindrome" : "No.It is not a palindrome");
        }

    }
}
