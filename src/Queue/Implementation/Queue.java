package Queue.Implementation;

/**
 * Created by starigopula on 2/1/2018.
 */
public class Queue {

    Node head;
    Node tail;

    public boolean isEmpty(){

        return head == null;

    }

    public int peek(){

        if(head == null){
            return 0;
        }

        return tail.data;
    }

    public void add (int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        Node temp = head;
        head = newNode;
        newNode.next = temp;

    }

    public void remove(){

        if (head == null){
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            if(temp.next == tail){
                temp.next = temp.next.next;
                tail = temp;
            }
            temp=temp.next;
        }
    }
}
