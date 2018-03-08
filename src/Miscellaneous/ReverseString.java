package Miscellaneous;

/**
 * Created by starigopula on 2/6/2018.
 */
public class ReverseString {
    public static void main(String args[]){

        String s ="Trintech";
        ReverseString r = new ReverseString();
        r.reverse(s);

    }

    public void reverse(String s) {

        if (s.isEmpty() || s.length() < 2 || s == null) {
            System.out.println("Invalid string. Cannot Reverse");
        } else {
            int length = s.length() - 1;
            char[] charSequence = s.toCharArray();
            for (int i = 0; i < length / 2; i++) {
                char temp = s.charAt(i);
                charSequence[i] = charSequence[length - i];
                charSequence[length - i] = temp;
            }
            System.out.println(new String(charSequence));
        }
    }
}
