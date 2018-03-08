package Linkedlist.Programs;

import Linkedlist.Implementation.LinkedList;

/**
 * Created by starigopula on 2/4/2018.
 */
public class PalindromeList {

    public static class Node{
        Node next;
        int data;
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

        public boolean isPalindrome(){

          // reverse the list and compare
          // get the to the last node and compare

            Node oneHop = head;
            Node twoHop = head;

            while(twoHop != null && twoHop.next!=null){
                oneHop = oneHop.next;
                twoHop = twoHop.next.next;
            }

            Node firstHalf = head;
            Node secondHalf = reverseList(oneHop);

            while(firstHalf !=null && secondHalf!=null){

                if(firstHalf.data != secondHalf.data){
                    return false;
                }

                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

        public Node reverseList(Node node){

            Node current = node;
            Node prev = null;

            while(current!=null){
                Node temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            return prev;
        }
    }

    public static void main(String args[]){

        int[] numbers = new int[]{1,2,1,2,1};

        LinkedList myList = new LinkedList();

        for(int number : numbers){
            myList.add(number);
        }

        System.out.println(myList.isPalindrome());
    }
}
