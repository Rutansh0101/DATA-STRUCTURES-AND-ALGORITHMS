import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class createTree {
    
    public static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Scanner scanner = new Scanner(System.in);

    public static Node createBTree(){
        int value = scanner.nextInt();
        if (value == -1) {
            return null;
        }
        Node newNode = new Node(value);
        System.out.println("Enter the left child of " + value);
        newNode.left = createBTree();
        System.out.println("Enter the right child of " + value);
        newNode.right = createBTree();
        return newNode;
    }
    
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    
    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
    
    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }
    
    
    static int index = 0;
    public static Node createTree(int[] arr){
        int value = arr[index];
        if (value == -1) {
            return null;
        }
        Node newNode = new Node(value);
        index++;
        newNode.left = createTree(arr);
        index++;
        newNode.right = createTree(arr);
        return newNode;
    }

    public static void levelOrderTraversal(Node root){
        if(root == null)    return;
        Queue<Node> queue = new ArrayDeque<>();
        Node marker = new Node(-1);
        queue.add(root);
        queue.add(marker);
        while(!queue.isEmpty()){
            Node currentNode = queue.peek();
            queue.remove();
            if(currentNode.data == -1){
                System.out.println();
                if(!queue.isEmpty())
                    queue.add(marker);
            }
            else{
                System.out.print(currentNode.data + " ");
                if(currentNode.left != null)    queue.add(currentNode.left);
                if(currentNode.right != null)    queue.add(currentNode.right);
            }
        }
        return;
    }

    public static void main(String[] args) {
        // Node root = createBTree();
        Node root = createTree(new int[]{10,50,40,-1,-1,-1,30,20,-1,-1,-1});
        // preOrderTraversal(root);
        // inOrderTraversal(root);
        // postOrderTraversal(root);
        levelOrderTraversal(root);
    }
}
