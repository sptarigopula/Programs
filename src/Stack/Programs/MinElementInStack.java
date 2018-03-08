package Stack.Programs;

/**
 * Created by starigopula on 2/8/2018.
 */
public class MinElementInStack {
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
            top.next = temp;
        }

        public int peek(){
            return top.data;
        }

        public int pop(){

            int data = top.data;
            top = top.next;
            return data;

        }
    }

    public static void main(String args[]){

        int numbers[] = new int[]{11,2,3,4,56,7,8,9,10};
        Stack myStack = new Stack();

        for(int number : numbers){
            myStack.push(number);
        }

        MinElementInStack min = new MinElementInStack();
        min.getMinElement(myStack,numbers.length);

    }

    public void getMinElement(Stack myStack, int length){

        Stack minElement = new Stack();

        for(int i = 0 ; i < length ; i++){
            if(minElement.top == null){
                minElement.push(myStack.pop());
                continue;
            }

            if(myStack.peek() < minElement.peek()){
                minElement.push(myStack.pop());
            }else{
                myStack.pop();
            }
        }

        System.out.println(minElement.peek());
    }
}
