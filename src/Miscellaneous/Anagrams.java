package Miscellaneous;

/**
 * Created by starigopula on 2/6/2018.
 */
public class Anagrams {

    public static void main(String args[]){

        String strings[] = new String[]{"art","rat"};

        Anagrams r = new Anagrams();
        r.isAnagram(strings);
    }

    public void isAnagram(String strings[]){
         String s1 = strings[0];
         String s2 = strings[1];

         if(s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty() || s1.length() != s2.length()){
             System.out.println("Invalid arguments");
         }
         else{
             int[] count = new int[256];
             boolean notAnagrams = false;
             for(int i = 0 ; i< s1.length()-1 ; i++){
                 count[s1.charAt(i)]++;
             }

             for(int i = 0 ; i < s2.length()-1; i++){
                 count[s2.charAt(i)]--;
                 if(count[s2.charAt(i)]< 0){
                     System.out.println("They are not anagrams");
                     notAnagrams = true;
                     break;
                 }
             }

             if(!notAnagrams) {
                 int i;
                 for (i = 0; i < count.length - 1; i++) {
                     if (count[i] != 0) {
                         System.out.println("No. They are not anagrams");
                         notAnagrams = true;
                         break;
                     }
                 }

                 if(!notAnagrams){
                     System.out.println("Yes.They are anagrams");
                 }
             }
         }
    }
}
