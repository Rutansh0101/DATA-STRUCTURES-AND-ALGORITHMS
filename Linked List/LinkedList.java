public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // create new node to add to the first:
        Node newNode = new Node(data);

        // if no element is there in the linked-list:
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: new Node next = head so that newNode stores previous first element as
        // next:
        newNode.next = head;

        // head = newNode so that ll starts from newNode:
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void traverse(Node head) {
        if (head != null) {
            System.out.print(head.data + "->");
            traverse(head.next);
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addNode(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        size++;

        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return;
    }

    public void removeFirst(){
        if(size == 0)   return;
        else if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
        return;
    }

    public void removeLast(){
        if(size == 0)   return;
        if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        Node prev = head;
        Node temp = head;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
        size--;
        return;
    }

    public int search(int num){
        int index = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == num){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int recursiveSearch(int num, Node head, int i){
        if(head == null){
            return -1;
        }
        if(head.data == num){
            return i;
        }
        return recursiveSearch(num, head.next, i+1);
    }

    public void reverse(){
        Node current = head;
        Node prev = null;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node prevHead = head;
        head = tail;
        tail = prevHead;
    }

    public void removeNthFromLast(int indexFromLast){
        if(indexFromLast == size){
            removeFirst();
            return;
        }
        int indexToRemove = size - indexFromLast;
        int index = 0;
        Node temp = head;
        Node prev = null;
        while(index < indexToRemove){
            prev = temp;
            temp = temp.next;
            index++;
        }
        prev.next = temp.next;
        temp.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addNode(3, 4);
        // ll.traverse(ll.head);
        // ll.removeFirst();
        // ll.removeLast();
        ll.print();
        // System.out.println(ll.size);
        // int num = 5;
        // System.out.println(num + " is present on " + ll.search(num) + " index");

        // recursiveSearch();
        // System.out.println(ll.recursiveSearch(5, ll.head, 0));

        // ll.reverse();
        // ll.print();

        // ll.removeNthFromLast(5);
        // ll.print();

        
    }
}