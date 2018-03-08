package Miscellaneous;

import java.util.Random;

/**
 * Created by starigopula on 2/14/2018.
 */
public class FindTheKthLargestElement {
    public static void main(String args[]){
        int numbers[] = new int[]{1,2,3,4,7,8,6,9,5};
        int k =5;
        System.out.println(getKthLargestElement(numbers,k));
    }

    public static int getKthLargestElement(int[] numbers , int k){
        int left = 0;
        int right = numbers.length-1;
        Random random = new Random();

        while(left <= right) {
            int randomPivot = random.nextInt(right - left + 1)+left;
            int pivot = partitionArray(numbers, left, right, randomPivot);

            if(pivot == k-1){
                return numbers[pivot];
            }else if(pivot < k-1){
                left = pivot+1;
            }else{
                right = pivot-1;
            }
        }
        return -1;
    }

    public static int partitionArray(int[] numbers, int left , int right , int randomPivot){

        int valueAtRandomPivot = numbers[randomPivot];
        int newPivotIndex = left;

        swap(numbers,valueAtRandomPivot,right);

        for(int i = left ; i<right ; i++){
            if(numbers[i] > valueAtRandomPivot){
                swap(numbers,i,newPivotIndex++);
            }
        }

        swap(numbers,right,newPivotIndex);
        return newPivotIndex;
    };

    public static void swap(int[] numbers, int valueAtRandomPivot,int right){
        int temp = numbers[valueAtRandomPivot];
        numbers[valueAtRandomPivot] = numbers[right];
        numbers[right] = temp;
    }
}
