package Linkedlist.Programs;

import Linkedlist.Implementation.LinkedList;
import Linkedlist.Implementation.Node;

/**
 * Created by starigopula on 2/1/2018.
 */
public class RemoveDupsFromUnsortedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head;

        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        public void removeDups() {

            if (head == null) {
                return;
            }

            Node previous = head;
            Node current = head.next;
            Node runner;

            while (current != null) {
                runner = head;
                while (runner != current) {
                    if (runner.data == current.data) {
                        Node temp = current.next;
                        previous.next = temp;
                        current = temp;
                        break;
                    }
                    runner = runner.next;
                }
                if (runner == current) {
                    previous = current;
                    current = current.next;
                }
            }
        }

        public void display(){
            Node temp = head;

            while(temp !=null){
                System.out.println(temp.data +" ");
                temp = temp.next;
            }

        }
    }

    public static void main(String args[]) {

        int numbers[] = new int[]{1,2,3,4,5,6,6,3,2,1};
        LinkedList myList = new LinkedList();

        for(int number : numbers){
            myList.add(number);
        }

        myList.display();

        myList.removeDups();

        myList.display();
    }
}


