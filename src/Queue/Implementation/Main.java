package Queue.Implementation;

/**
 * Created by starigopula on 2/1/2018.
 */
public class Main {

    public static void main(String args[]){
        int numbers[] = new int[]{1,2,3,4,5,6};
        Queue myQueue = new Queue();

        for(int number : numbers){
            myQueue.add(number);
        }

    }
}
