package Linkedlist.Implementation;

/**
 * Created by starigopula on 2/1/2018.
 */
public class LinkedList {
    public Node head;

        public Node add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                return head;
            }

            Node temp = head;
            head = newNode;
            newNode.next = temp;

            return head;
        }

        public Node append(int data){
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return head;
            }

            Node temp = head;

            while ( temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
            return head;
        }

        public void delete(int data) {

            if(head == null){
                return;
            }

            if(head.data == data){
                head = head.next;
                return;
            }

            Node temp = head;

            while (temp.next !=null){
                if(temp.next.data == data){
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }

        public void display(){
            if(head == null){
                System.out.println("There are no elements to display");
            }

            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public void circle(Node head){

            if(head == null){
                return ;
            }

            Node temp = head;

            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = head.next;

        }
}
