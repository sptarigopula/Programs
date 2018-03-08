package LeetCode;

/**
 * Created by starigopula on 2/16/2018.
 * One bit character - 0
 * Two bit character - 10 , 11
 * eg - [1,0,0] o/p - true as the last character is one bit character
 *  1,0,0 - 10 , 0
 * eg - [1,1,1,0] o/p - false as the we divide we get 11 , 10
 */
public class OneBitTwoBitCharacters {
    public static void main(String args[]){
        int[] array = new int[]{1,1,1,0};
        System.out.println(isLastCharacterOneBit(array));
    }

    public static boolean isLastCharacterOneBit(int[] array){

        int length = array.length-1;
        if(array[length]==0 && array[length-1]==0)
            return true;
        return false;
    }
}
