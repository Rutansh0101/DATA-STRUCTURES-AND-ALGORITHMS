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


    public static Node createTree(int[] arr){
        int index = 0;
        Node root = null;
        while(index != arr.length){
            root = buildBST(arr[index++], root);
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


    public static int minElement(Node root){
        if(root.left == null){
            return root.data;
        }
        return minElement(root.left);
    }
    

    public static int maxElement(Node root){
        if(root.right == null){
            return root.data;
        }
        return maxElement(root.right);
    }

    public static boolean searchInBST(Node root, int target){
        if(root == null)    return false;
        if(root.data == target)  return true;
        if(root.data > target)  return searchInBST(root.left, target);
        return searchInBST(root.right, target);
    }


    public static void main(String[] args){
        int[] arr = {100, 50, 200, 20, 70, 150, 250};
        Node root = createTree(arr);
        System.out.println("Level Order Traversal:");
        levelOrderTraversal(root);
        System.out.println();
        
        
        
        // System.out.println("Pre Order Traversal:");
        // preOrderTraversal(root);
        // System.out.println();
        
        
        
        // System.out.println("In Order Traversal:");
        // inOrderTraversal(root);
        // System.out.println();
        
        
        
        // System.out.println("Post Order Traversal:");
        // postOrderTraversal(root);
        // System.out.println();



        // System.out.println(minElement(root));
        // System.out.println(maxElement(root));


        // Element searching in BST:
        System.out.println(searchInBST(root, 250));



        
    }
}