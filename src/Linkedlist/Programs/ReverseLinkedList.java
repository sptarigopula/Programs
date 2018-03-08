package Linkedlist.Programs;

/*import Linkedlist.Implementation.LinkedList;
import Linkedlist.Implementation.Node;*/

import Linkedlist.Implementation.LinkedList;

/**
 * Created by starigopula on 2/2/2018.
 */
public class ReverseLinkedList {

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

            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }

        public void display(){

            Node temp = head;

            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }

        public void reverseList(){

            Node temp = head;
            Node prev = null , next;

            while(temp!=null){
                 next = temp.next;
                 temp.next = prev;
                 prev = temp;
                 temp = next;
            }

            head = prev;
        }
    }

    public static void main(String args[]){

        int[] numbers = new int[]{1,2,3,4,5};

        LinkedList myList = new LinkedList();

        for(int number : numbers){
            myList.add(number);
        }

        myList.display();

        myList.reverseList();

        myList.display();

    }
}
