package Miscellaneous;

/**
 * Created by starigopula on 2/6/2018.
 */
public class StringPermutations {

    public static void main(String args[]){

        String s = "abc";
        StringPermutations sp = new StringPermutations();
        sp.combinations(s,0,s.length()-1);

    }

    public void combinations(String s , int start , int end){

        if(start == end){
            System.out.println(s);
        }

        else{
            for(int i = start ; i <= end ; i++){
                s = swap(s,start,i);
                combinations(s,start+1,end);
                s = swap(s,start,i);
            }
        }

    }

    public String swap(String s , int start , int end){

        char[] array = s.toCharArray();
        char temp;
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        return String.valueOf(array);

    }

}
