package Stack.Programs;

import Stack.Implementation.Stack;

/**
 * Created by starigopula on 2/1/2018.
 */
public class ValidBrackets {
    public static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
        }
    }

    public static class Stack{

        Node top;

        public boolean isEmpty(){
            return top == null;
        }

        public void push(char data){
            Node newNode = new Node(data);
            if(top == null){
                top = newNode;
                return;
            }
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }

        public char pop(){
            char data = top.data;
            top = top.next;
            return data;
        }

        public char peek(){
            return top.data;
        }
    }

    public static void main(String args[]) {
        ValidBrackets vb = new ValidBrackets();
        String input[] = new String[]{"{{([])}}", "{{{{", "{})", "()"};


        for (String inputString : input) {
            String result = vb.isValid(inputString);
            System.out.println(result);
        }
    }

    public String isValid(String inputString) {

        if (inputString == null || inputString.isEmpty() || inputString.length() < 2) {
            return "No";
        }

        Stack myStack = new Stack();

        for (int i = 0; i <= inputString.length() - 1; i++) {
            if (inputString.charAt(i) == '{' || inputString.charAt(i) == '[' || inputString.charAt(i) == '(') {
                myStack.push(inputString.charAt(i));
            } else if (inputString.charAt(i) == '}' && !myStack.isEmpty() && myStack.peek() == '{' ) {
                myStack.pop();
            } else if (inputString.charAt(i) == ']' && !myStack.isEmpty() && myStack.peek() == '[') {
                myStack.pop();
            } else if (inputString.charAt(i) == ')' && !myStack.isEmpty() && myStack.peek() == '(') {
                myStack.pop();
            } else {
                return "No";
            }
        }

        if(!myStack.isEmpty())
            return "No";
        return "Yes";
    }
}
