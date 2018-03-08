package Linkedlist.Programs;

/**
 * Created by starigopula on 2/3/2018.
 */
public class CircularLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node (int data){
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

        public void prepend(int data){

            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
            }

            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }

        public void delete(int data){

            Node temp = head;

            while(temp.next != null){
                if(temp.data == data){
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
        }

        public void display(Node head){

            Node temp = head ;

            while (temp !=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        public void createLoop(Node head){

            Node temp = head;

            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = head.next;
        }

        public boolean isLoopDetected(Node head){

            if(head == null){
                return false;
            }

            Node oneHop = head;
            Node twoHop = head;

            while(twoHop.next!=null && twoHop!=null){
                oneHop = oneHop.next;
                twoHop = twoHop.next.next;

                if(oneHop == twoHop){
                    return true;
                }
            }

            return false;
        }

    }

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        int[] numbers = new int[]{1,2,3,4,5};

        for(int number : numbers){
            myList.add(number);
        }

        System.out.print("Add :" + " ");

        myList.display(myList.head);

        myList.createLoop(myList.head);

        System.out.println("After loop creation :" + " ");

        myList.display(myList.head);

        System.out.println(myList.isLoopDetected(myList.head));


    }
}
