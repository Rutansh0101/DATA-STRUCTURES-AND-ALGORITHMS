public class addIntheMiddle {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addNode(3, 4);
        // ll.traverse(ll.head);
        // ll.print();
        System.out.println(ll.size);
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // create new node to add to the first:
        Node newNode  = new Node(data);

        // if no element is there in the linked-list:
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        // step 2: new Node next = head so that newNode stores previous first element as next:
        newNode.next = head;
        
        // head = newNode so that ll starts from newNode:
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }
    
    public void traverse(Node head){
        if(head != null){
            System.out.print(head.data + "->");
            traverse(head.next);
        }
    }
    
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public void addNode(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        size++;

        Node temp = head;
        int i = 0;
        
        while(i < index-1){
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return;
    }
}