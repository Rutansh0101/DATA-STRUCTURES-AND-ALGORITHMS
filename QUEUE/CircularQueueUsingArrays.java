class CircularQueue {

    static int[] arr;
    static int size;
    static int front;
    static int rear;

    public CircularQueue(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    public static void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        int result = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return arr[front];
    }
}

public class CircularQueueUsingArrays {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.pop();
        q.add(1);
        q.pop();
        q.add(2);

        while (!q.isEmpty()) {
            System.out.print(q.pop() + " ");
        }
    }
}