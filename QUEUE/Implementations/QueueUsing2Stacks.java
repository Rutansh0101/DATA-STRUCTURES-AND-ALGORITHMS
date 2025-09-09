import java.util.Stack;

class Queue{
    static Stack<Integer> s1;
    static Stack<Integer> s2;

    public Queue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public static void add(int data){
        if(s1.isEmpty()){
            s1.push(data);
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
    }

    public static int remove(){
        if(s1.empty()){
            return -1;
        }
        return s1.pop();
    }
    
    public static int peek(){
        if(s1.empty()){
            return -1;
        }
        return s1.peek();    
    }

    public static boolean isEmpty(){
        return s1.isEmpty();
    }
}

public class QueueUsing2Stacks {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
