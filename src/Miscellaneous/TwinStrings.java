package Miscellaneous;

/**
 * Created by starigopula on 2/1/2018.
 */
public class TwinStrings {

    public static void main(String args[]){
         String a = "abcd";
         String b = "cdae";

         if(a== null || b==null || a.isEmpty() || b.isEmpty() || a.length()!=b.length()){
             System.out.println("No");
         }

         int even[] = new int[256];
         int odd[] = new int[256];

         for(int i=0;i<a.length();i++){
             if(i %2 == 0){
                 even[a.charAt(i)]++;
             }
             else{
                 odd[a.charAt(i)]++;
             }
         }

         int i;

        for(i=0;i<b.length();i++){
            if(i%2==0){
                even[b.charAt(i)]--;
                if(even[b.charAt(i)] < 0){
                    break;
                }
            }
            else{
                odd[b.charAt(i)]--;
                if(odd[b.charAt(i)] < 0){
                    break;
                }
            }
        }

        System.out.println( b.length() == i ? "Yes" : "No");

    }
}
