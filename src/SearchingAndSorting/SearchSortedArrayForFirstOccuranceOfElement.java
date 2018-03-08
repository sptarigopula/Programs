package SearchingAndSorting;

import java.util.ArrayList;

/**
 * Created by starigopula on 2/11/2018.
 */
public class SearchSortedArrayForFirstOccuranceOfElement {

    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        int number = 4;
        System.out.println(getTheIndexOfElement(numbers,number));
    }

    public static int getTheIndexOfElement(ArrayList<Integer> numbers,int number){

        int result = 0;
        int left = 0;
        int right = numbers.size()-1;

        while(left <= right){
            int middle = left + ((right-left))/2;

            if(numbers.get(middle) > number){
                right = middle-1;
            }
            else if(numbers.get(middle) == number){
                result = middle;
                right = middle-1;
            }
            else{
                left = middle+1;
            }
        }
        return result;
    }
}
