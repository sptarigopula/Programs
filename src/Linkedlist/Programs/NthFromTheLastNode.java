package Linkedlist.Programs;

import Linkedlist.Implementation.LinkedList;

/**
 * Created by starigopula on 2/7/2018.
 */
public class NthFromTheLastNode {

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
    }

    public static void main(String args[]){
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        int n = 6;
        LinkedList list = new LinkedList();

        for(int number : numbers){
            list.add(number);
        }

        NthFromTheLastNode node = new NthFromTheLastNode();
        node.getNthFromLastNode(list,n);
        list.display();
    }

    public void getNthFromLastNode(LinkedList list , int n){
        Node oneHop = list.head;
        Node twoHop = list.head;

        for(int i =0 ; i<=n ; i++){
            oneHop = oneHop.next;
        }
        while(oneHop!=null){
            oneHop = oneHop.next;
            twoHop = twoHop.next;
        }

        System.out.println(twoHop.next.data);
        twoHop.next = twoHop.next.next;
    }
}


