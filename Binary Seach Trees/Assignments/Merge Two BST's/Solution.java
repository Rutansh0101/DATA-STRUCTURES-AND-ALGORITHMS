import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    Node left, right;
    
    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    public ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        
        Node a = root1;
        Node b = root2;
        
        while(true){
            
            while(a != null){
                s1.push(a);
                a = a.left;
            }
            
            while(b != null){
                s2.push(b);
                b = b.left;
            }
            
            if(s1.isEmpty() && s2.isEmpty()){
                break;
            }
            Node atop = new Node(Integer.MAX_VALUE);
            Node btop = new Node(Integer.MAX_VALUE);
            
            if(!s1.isEmpty()) atop = s1.peek();
            if(!s2.isEmpty()) btop = s2.peek();
            
            if(atop.data <= btop.data){
                ans.add(atop.data);
                s1.pop();
                a = atop.right;
            }
            else{
                ans.add(btop.data);
                s2.pop();
                b = btop.right;
            }
        }
        return ans;
    }
}