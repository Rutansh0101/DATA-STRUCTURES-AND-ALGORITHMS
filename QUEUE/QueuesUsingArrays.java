class Queue{
    
    static int[] arr;
    static int size;
    static int rear;

    public Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    public static void add(int data){
        if(rear == size-1){
            System.out.println("Queue is Full.");
            return;
        }
        rear = rear + 1;
        arr[rear] = data;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int front = arr[0];
        for(int i = 0; i < rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return -1;
        }
        return arr[0];
    }
}

public class QueuesUsingArrays{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}