class Queue{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    Node tail;
    public int size;

    public Queue(){
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int data){
        size++;
        if(head == null){
            head = tail = new Node(data);
            return;
        }

        tail.next = new Node(data);
        tail = tail.next;
    }

    public int remove(){
        if(head == null){
            return -1;
        }
        size--;
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek(){
        if(head == null)    return -1;
        return head.data;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

public class reorderQueue {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);

        q1.print();
        System.out.println();
        Queue q2 = new Queue();

        for(int i = 0; i <= q1.size/2; i++){
            q2.add(q1.remove());
        }
        
        while(!q2.isEmpty()){
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
        
        q1.print();
        System.out.println();
    }
}
