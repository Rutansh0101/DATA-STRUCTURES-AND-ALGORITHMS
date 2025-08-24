import java.util.Deque;
import java.util.LinkedList;

class Stack{
    Deque<Integer> d1 = new LinkedList<>();

    public void push(int data){
        d1.addLast(data);
    }

    public int pop(){
        if(d1.isEmpty()){
            return -1;
        }

        return d1.removeLast();
    }

    public int peek(){
        if(d1.isEmpty()){
            return -1;
        }
        return d1.getLast();
    }

    public boolean isEmpty(){
        return d1.isEmpty();
    }
}

public class stackUsingDeque {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
