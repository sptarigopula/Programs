package Stack.Implementation;

import Stack.Implementation.*;

/**
 * Created by starigopula on 2/1/2018.
 */
public class Main {

    public static void main(String args[]){

        int[] numbers = new int[]{1,2,3,4,5,6};
        Stack myStack = new Stack();

        for(int number : numbers){
            myStack.push(number);
        }

        myStack.show();

        System.out.println(myStack.pop());

        myStack.show();

    }
}
