import java.util.Deque;
import java.util.LinkedList;

class Queue{
    Deque<Integer> d1;

    public Queue(){
        d1 = new LinkedList<>();
    }

    public void add(int data){
        d1.addLast(data);
    }

    public int remove(){
        if(d1.isEmpty()){
            return -1;
        }
        return d1.removeFirst();
    }

    public int peek(){
        if(d1.isEmpty()){
            return -1;
        }
        return d1.getFirst();
    }

    public boolean isEmpty(){
        return d1.isEmpty();
    }
}

public class QueueUsingDeque {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while(!q1.isEmpty()){
            System.out.println(q1.remove());
        }
    }
}
