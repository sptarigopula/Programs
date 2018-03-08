package Stack.Implementation;

/**
 * Created by starigopula on 2/1/2018.
 */
public class Stack {

    Node top;

    public boolean isEmpty(){

        return top == null;

    }

    public int peek(){

        return top.data;

    }

    public void push(int data){

        Node newTop = new Node(data);
        if(top == null){
            top = newTop;
            return;
        }

        Node temp = top;
        top = newTop;
        newTop.next = temp;

    }

    public int pop(){

        int data = top.data;
        top = top.next;
        return data;

    }

    public void show(){

        if(top == null){
            System.out.println("There are no elements to display");

        }

        Node temp = top;

        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
