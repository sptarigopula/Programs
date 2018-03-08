package SearchingAndSorting;

import java.util.ArrayList;

/**
 * Created by starigopula on 2/11/2018.
 */
public class SearchAnArrayForAnElementWhoseIndexIsEqualToNumber {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        System.out.println(getTheElementWhoseIndexValueIsSameAsThatOfTheElement(numbers));
    }

    public static int getTheElementWhoseIndexValueIsSameAsThatOfTheElement(ArrayList<Integer> numbers){

        int left = 0;
        int right = numbers.size()-1;

        while(left <= right){
            int middle = left + ((right-left)/2);
            int difference = numbers.get(middle) - middle;

            if(difference == 0){
                return  middle;
            }else if(difference > 0){
                right = middle -1;
            }else{
                left = middle + 1;
            }
        }
        return -1;
    }
}
