import java.util.*;

class Node {
    int data;
    Node left, right;
    
    Node(int item) {
        data = item;
        left = right = null;
    }
}


class Solution {
    
    public void findPredecessor(Node root, int key, Node[] ans){
        if(root == null)    return;
        if(root.data >= key){
            findPredecessor(root.left, key, ans);
        }
        else{
            ans[0] = (ans[0].data < root.data) ? root : ans[0];
            findPredecessor(root.right, key, ans);
        }
        return;
    }
    
    public void findSuccessor(Node root, int key, Node[] ans){
        if(root == null)    return;
        if(root.data <= key){
            findSuccessor(root.right, key, ans);
        }
        else{
            ans[0] = (ans[0].data > root.data) ? root : ans[0];
            findSuccessor(root.left, key, ans);
        }
        return;
    }
    
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node[] predecessor = new Node[]{new Node(Integer.MIN_VALUE)};
        Node[] successor = new Node[]{new Node(Integer.MAX_VALUE)};
        findPredecessor(root, key, predecessor);
        findSuccessor(root, key, successor);
        if(predecessor[0].data == Integer.MIN_VALUE){
            predecessor[0].data = -1;
        }
        if(successor[0].data == Integer.MAX_VALUE){
            successor[0].data = -1;
        }
        ArrayList<Node> ans = new ArrayList<>();
        ans.add(predecessor[0]);
        ans.add(successor[0]);
        return ans;
    }
}