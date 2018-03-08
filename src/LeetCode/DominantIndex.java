package LeetCode;

/**
 * Created by starigopula on 2/16/2018.
 */
public class DominantIndex {
    public static void main(String args[]){
        int numbers[] = new int[]{1,2,5};
        System.out.println(getDominantIndex(numbers));
    }

    public static int getDominantIndex(int[] numbers){
        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i =0;i< numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
                index = i;
            }
        }

        for(int i =0;i< numbers.length;i++){
            if(numbers[i] != max && numbers[i]*2 > max){
                return -1;
            }
        }
        return index;
    }
}
