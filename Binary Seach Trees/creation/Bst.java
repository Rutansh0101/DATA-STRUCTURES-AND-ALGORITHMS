import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class Bst{
    static Scanner sc = new Scanner(System.in);

    public static Node buildBST(int val, Node root){
        if(root == null)
            return new Node(val);
        else{
            if(root.data > val){
                root.left = buildBST(val, root.left);
            }
            else{
                root.right = buildBST(val, root.right);
            }
        }
        return root;
    }


    public static Node createTree(){
        System.out.println("Enter the value for Node: ");
        int val = sc.nextInt();
        
        Node root = null;
        
        while(val != -1){

            root = buildBST(val, root);

            System.out.println("Enter the value for Node: ");
            val = sc.nextInt();
        }
        return root;
    }

    public static void levelOrderTraversal(Node root){
        if(root == null)    return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node currentNode = queue.poll();
                System.out.print(currentNode.data + "  ");
                if(currentNode.left != null)    queue.offer(currentNode.left);
                if(currentNode.right != null)    queue.offer(currentNode.right);
            }
            System.out.println();
        }
        return;
    }

    public static void preOrderTraversal(Node root){
        if(root == null)    return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root){
        if(root == null)    return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root == null)    return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }


    public static void main(String[] args){
        Node root = createTree();
        levelOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
    }
}