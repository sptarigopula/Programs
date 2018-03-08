package Stack.Programs;

/**
 * Created by starigopula on 2/8/2018.
 */
public class QueueUsingStack {
    public static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    public static class Stack{
        Node top;

        public void push(int data){
            Node newTop = new Node(data);

            if(top == null){
                top = newTop;
                return;
            }

            Node temp = top;
            top = newTop;
            top.next = top;
        }

        public int pop(){
            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek(){
            return top.data;
        }

        public boolean isEmpty(){
            return top == null;
        }
    }

    public static void main(String args[]){

        int numbers[] = new int[]{1,2,3,4,5,6,7,8,9};
        Stack myStack = new Stack();

        for(int number : numbers){
            myStack.push(number);
        }

        QueueUsingStack queue = new QueueUsingStack();
        queue.getQueueUsingStack(myStack);

    }

    public void getQueueUsingStack(Stack myStack){

        //get head

        //get tail

    }
    public void add(int data){

    }

    public int peek(){
        return 0;
    }

    public void remove(){

    }

}
