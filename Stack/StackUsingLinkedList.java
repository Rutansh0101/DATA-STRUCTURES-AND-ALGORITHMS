public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static class Stack{
        public static Node head = null;    
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            return;
        }

        public static void pop(){
            if(isEmpty())   return;
            head = head.next;
            return;
        }

        public static int peek(){
            if(isEmpty())   return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        // System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
