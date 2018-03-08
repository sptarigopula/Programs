package Stack.Programs;

/**
 * Created by starigopula on 2/8/2018.
 */
public class SortAStack {
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

         public void display(){
             Node temp = top;
             while(temp!=null){
                 System.out.print(temp.data+" ");
                 temp = temp.next;
             }
         }
    }

    public static void main(String args[]){
        int numbers[] = new int[]{1,2,3,5,4,8,7};
        Stack myStack = new Stack();

        for(int number : numbers){
            myStack.push(number);
        }
        System.out.println( "Initial Stack : " );
        myStack.display();

        SortAStack sortStack = new SortAStack();
        Stack sortedStack = sortStack.getSortedStack(myStack);
        System.out.println( "Sorted Stack : ");
        sortedStack.display();
    }

    public Stack getSortedStack(Stack myStack){

        Stack sortedStack = new Stack();

        Node temp = myStack.top;

        while(temp != null){
            if(sortedStack.top ==null || (myStack.peek() <  sortedStack.peek())){
                sortedStack.push(myStack.pop());
            }else if((myStack.peek() >  sortedStack.peek())){
                int data = sortedStack.pop();
                sortedStack.push(myStack.pop());
                sortedStack.push(data);
            }
            temp = myStack.top;
        }
        return sortedStack;
    }
}
