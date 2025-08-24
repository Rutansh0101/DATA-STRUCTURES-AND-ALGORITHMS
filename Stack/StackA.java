import java.util.ArrayList;

public class StackA{
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

class Stack{
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty(){
        return list.size() == 0;
    }

    public static void push(int data){
        list.add(data);
    }

    public static void pop(){
        list.remove(list.size()-1);
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return list.get(list.size()-1);
    }
}
