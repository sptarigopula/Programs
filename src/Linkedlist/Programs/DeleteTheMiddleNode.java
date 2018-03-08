package Linkedlist.Programs;


/**
 * Created by starigopula on 2/2/2018.
 */
public class DeleteTheMiddleNode {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{

        Node head;

        public void add(int data){

            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            Node temp = head;

            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = newNode;
        }

        public void display(){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

        }

        public void deleteMiddleNode(){

            Node oneHop = head;
            Node twoHop = head;
            Node prev = null;
            while(twoHop!=null && twoHop.next!=null){

                prev = oneHop;
                oneHop = oneHop.next;
                twoHop = twoHop.next.next;
            }

            prev.next = oneHop.next;
        }
    }

    public static void main(String args[]){

        int[] numbers = new int[]{1,2,3,4,5,6};
        LinkedList myList = new LinkedList();

        for(int i : numbers){
            myList.add(i);
        }

        myList.deleteMiddleNode();

        myList.display();
    }

}
