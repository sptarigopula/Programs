package LeetCode;

/**
 * Created by starigopula on 2/17/2018.
 */
public class CountofNumbersLessThanTheValueInSecondArray {
    public static void main(String args[]){
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{3,5,6};
        int[] array3 = getCount(array1,array2);
    }

    public static int[] getCount(int[] array1,int[] array2){
        int[] output = new int[array2.length];
        int count = 0;
        int nextIndex =0;
        for(int i =0;i<array2.length;i++){
            for(int j=nextIndex;j<array1.length;j++) {
                if (array1[j] < array2[i]) {
                    count++;
                    nextIndex = j+1;
                }
            }
            output[i] = count;
        }
        return output;
    }
}
