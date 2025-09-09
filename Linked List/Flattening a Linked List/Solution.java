class Node{
    int data;
    Node next;
    Node bottom;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}


class Solution {
    
    Node merge(Node first, Node second){
        Node head = new Node(-1);
        Node temp = head;
        while(first != null && second != null){
            if(first.data <= second.data){
                temp.bottom = new Node(first.data);
                first = first.bottom;
                temp = temp.bottom;
            }
            else{
                temp.bottom = new Node(second.data);
                second = second.bottom;
                temp = temp.bottom;
            }
        }
        while(first != null){
            temp.bottom = new Node(first.data);
            first = first.bottom;
            temp = temp.bottom;
        }
        while(second != null){
            temp.bottom = new Node(second.data);
            second = second.bottom;
            temp = temp.bottom;
        }
        return head.bottom;
    }
    
    Node flatten(Node root) {
        // code here
        Node ans = root;
        Node temp = root.next;
        while(temp != null){
            ans = merge(ans, temp);
            temp = temp.next;
        }
        temp = ans;
        while(temp != null){
            temp.next = temp.bottom;
            temp = temp.bottom;
        }
        return ans;
    }
}