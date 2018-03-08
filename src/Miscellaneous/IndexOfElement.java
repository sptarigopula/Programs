package Miscellaneous;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by starigopula on 2/13/2018.
 */
public class IndexOfElement {
    public static void main(String args[]){
        int[] numbers = new int[]{1,8,3,9,5};
        System.out.println("LargestNumber Index : " +getTheLargestIndex(numbers));
        System.out.println("SmallestNumber Index : " +getTheSmallestIndex(numbers));
        System.out.println("SecondLargestNumber Index : " +getTheSecondLargestElementIndex(numbers));
        System.out.println("SecondSmallestNumber Index : " +getTheSecondSmallestElementIndex(numbers));
    }

    public static int getTheLargestIndex(int[] numbers){

        int largestNumber = Integer.MIN_VALUE;
        int largestIndex = -1;

        for(int i = 0 ; i< numbers.length -1 ; i++){
            if(largestNumber == Integer.MIN_VALUE){
               largestNumber = numbers[i];
               largestIndex = i;
            }else {
                if(numbers[i]> largestNumber){
                    largestNumber = numbers[i];
                    largestIndex = i;
                }
            }
        }
        return largestIndex;
    }

    public static int getTheSmallestIndex(int[] numbers){
        int smallestNumber = Integer.MAX_VALUE;
        int smallestIndex = -1;
         for(int i =0 ; i < numbers.length -1 ; i++){
             if(smallestNumber == Integer.MAX_VALUE){
                 smallestNumber = numbers[i];
                 smallestIndex = 0;
             }else if(numbers[i] < smallestNumber){
                 smallestNumber = numbers[i];
                 smallestIndex = i;
             }
         }
         return smallestIndex;
    }

    public static int getTheSecondLargestElementIndex(int[] values){
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        int index=-1;

        for(int i =0 ; i < values.length ; i++){
           /* if(largestNumber == Integer.MIN_VALUE){
                largestNumber = values[i];
                index = i;
            }else {
                if(values[i] > largestNumber && largestNumber>secondLargestNumber){
                    secondLargestNumber = largestNumber;
                    largestNumber = values[i];
                    index = i;
                }
                else if(values[i] > secondLargestNumber){
                    secondLargestNumber = values[i];
                    index = i;
                }
            }*/
           if(values[i] > largestNumber){
               largestNumber = values[i];
           }
        }

        for(int i =0 ; i < values.length ; i++){
            if(values[i] < largestNumber && values[i]> secondLargestNumber){
                secondLargestNumber = values[i];
                index = i;
            }
        }
        return index;
    }

    public static int getTheSecondSmallestElementIndex(int[] values){

        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;
        int index = -1;

        for(int i =0 ; i < values.length  ; i++){
            /*if(smallestNumber == Integer.MAX_VALUE){
                smallestNumber = values[i];
            }else {
                if(values[i] < smallestNumber && secondSmallestNumber < smallestNumber){
                    secondSmallestNumber = smallestNumber;
                    smallestNumber = values[i];
                } else if(values[i] < secondSmallestNumber){
                    secondSmallestNumber = values[i];
                    index = i;
                }
            }*/
            if(values[i]<smallestNumber){
                smallestNumber = values[i];
            }
        }

        for(int i =0;i<values.length ; i++){
            if(values[i] > smallestNumber && values[i] < secondSmallestNumber){
                secondSmallestNumber = values[i];
                index = i;
            }
        }
        return index;
    }
}
