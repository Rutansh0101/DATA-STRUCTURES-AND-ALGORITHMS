import java.util.Stack;

class Node
{
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Solution {
    
    
    public static int countPairs(Node root1, Node root2, int x) {
        // count of pairs with sum x:
        int ans = 0;
        
        // to iterate through both trees:
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        
        // start with root1 and root2:
        Node a = root1;
        Node b = root2;
        
        while(true){
            
            //inorder of root1:
            while(a != null){
                s1.push(a);
                a = a.left;
            }
            
            // reverse inorder of root2:
            while(b != null){
                s2.push(b);
                b = b.right;
            }
            
            // if both stacks are empty, we are done:
            if(s1.isEmpty() || s2.isEmpty()){
                break;
            }
            
            // get the top nodes of both stacks:
            Node atop = s1.peek();
            Node btop = s2.peek();
            
            // calculate the sum of the top nodes:
            int sum = atop.data + btop.data;
            
            // if the sum is equal to x, we found a pair:
            if(sum == x){
                ans++;
                s1.pop();
                a = atop.right;
                s2.pop();
                b = btop.left;
            }
            // if the sum is less than x, move to the next node in root1:
            else if(sum < x){
                s1.pop();
                a = atop.right;
            }
            // if the sum is greater than x, move to the next node in root2:
            else{
                s2.pop();
                b = btop.left;
            }
        }
        
        // return the count of pairs found:
        return ans;
    }
}