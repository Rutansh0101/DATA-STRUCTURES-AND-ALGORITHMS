public class reverseString {
    public static class Stack{
        
        public class Node{
            char data;
            Node next;
            Node prev;
            Node(char data){
                this.data = data;
            }
        }

        Node head;
        Node tail;

        public void push(char c){
            Node newNode = new Node(c);
            
            if(head == null){
                head = tail = newNode;
                newNode.prev = null;
                return;
            }
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        public void pop(){
            if(head == null){
                return;
            }
            if(head.next == null){
                head = tail = null;
                return;
            }
            tail.prev.next = null;
            tail = tail.prev;
            return;
        }

        public char peek(){
            return tail.data;
        }

        public void print(){
            
        }
    }
    
    public static void main(String[] args) {
        Stack str = new Stack();
        // str.push('a');
        // str.push('b');
        // str.push('c');
        // str.push('d');

        String s = "rutansh";
        for(int i = 0; i < s.length(); i++){
            str.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            ans.append(str.peek());
            str.pop();
        }

        s = ans.toString();

        System.out.println(s);
    } 
}
