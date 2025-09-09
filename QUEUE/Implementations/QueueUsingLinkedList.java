class Queue{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public Queue(){
        head = null;
        tail = null;
    }


    public static void push(int data){
        
        if(head == null){
            head = tail = new Node(data);
            return;
        }

        tail.next = new Node(data);
        tail = tail.next;
        return;
    }

    public static int pop(){
        if(head == null){
            return -1;
        }
        if(head == tail){
            int data = head.data;
            head = tail = null;
            return data;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public static boolean isEmpty(){
        return head == null;
    }

    public static int peek(){
        return head == null ? -1 : head.data;
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);

        while(!q.isEmpty()){
            System.out.print(q.pop() + " ");
        }
    }
}