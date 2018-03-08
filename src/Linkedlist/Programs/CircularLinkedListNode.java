package Linkedlist.Programs;

/**
 * Created by starigopula on 2/2/2018.
 */
public class CircularLinkedListNode {

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

        public void createLoop(Node head){

            Node temp = head;

            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = head.next;
        }

        public Node meetingPoint(Node head){

            Node oneHop = head;
            Node twoHop = head;

            if(twoHop.next!=null || twoHop !=null){
                 twoHop = twoHop.next.next;
                 oneHop = oneHop.next.next;

                 if(oneHop == twoHop){

                     oneHop = head;

                     while(oneHop != twoHop){
                         oneHop = oneHop.next;
                         twoHop = twoHop.next;
                     }
                     return oneHop;
                 }
            }
            return null;
        }

        public void display(){

            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]){

        int numbers[] = new int[]{1,2,3,4,5,3};
        LinkedList myList = new LinkedList();

        for(int number : numbers){
            myList.add(number);
        }

        myList.createLoop(myList.head);
        myList.display();
        Node meetingNode = myList.meetingPoint(myList.head);
        System.out.println(meetingNode!=null ? meetingNode.data : null);
    }
}
