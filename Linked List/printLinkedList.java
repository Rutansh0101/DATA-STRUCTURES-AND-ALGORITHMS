public class printLinkedList{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        Node temp = ll.head;
        
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
    

    public Node head;
    public Node tail;

    public void addFirst(int data){
        // create new node to add to the first:
        Node newNode  = new Node(data);

        // if no element is there in the linked-list:
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
}