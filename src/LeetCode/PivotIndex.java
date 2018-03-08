package LeetCode;

/**
 * Created by starigopula on 2/16/2018.
 * Here Pivot index implies the index whose sum of values to the right is
 * equal to the ones towards the left
 */
public class PivotIndex {
    public static void main(String args[]){
        int[] array = new int[]{1,1,2,3,4};
        System.out.println(getPivotIndex(array));
    }

    public static int getPivotIndex(int[] array){

        int sum =0;
        for(int i =0;i<array.length;i++){
            sum += array[i];
        }

        int presum =0;

        for(int i =0;i<array.length;i++){
           /* if(sum-array[i] == presum*2){
                return i;
            }
            presum += array[i];*/
           sum = sum - array[i];
           if(sum == presum){
               return i;
           }
           presum += array[i];
        }
        return -1;
    }
}
