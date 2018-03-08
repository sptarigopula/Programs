package Linkedlist.Implementation;

/**
 * Created by starigopula on 2/1/2018.
 */
public class Main {

    public static void main (String args[]){

        int[] data = new int[]{1,2,3,4,5,6};
        LinkedList list = new LinkedList();

        /*for(int value : data) {
            list.add(value);
        }*/

       // list.display();

        for(int value : data) {
            list.append(value);
        }

        System.out.println("Append function :");

        list.display();

/*        for(int value : data) {
            list.delete(value);
        }

        list.display();*/
    }
}
