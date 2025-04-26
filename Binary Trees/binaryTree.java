import java.util.LinkedList;
import java.util.Queue;

public class binaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public void preOrder(Node root){
            if(root == null)    return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root){
            if(root == null)    return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        public void postOrder(Node root){
            if(root == null)    return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currentNode = q.remove();
                if(currentNode == null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else    q.add(null);
                } else{
                    System.out.print(currentNode.data + " ");
                    if(currentNode.left != null)
                    q.add(currentNode.left);
                    if(currentNode.right != null)
                    q.add(currentNode.right);
                }
            }
        }

        public int countNodes(Node root){
            if(root == null)    return 0;
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);
            return leftNodes + rightNodes + 1;
        }

        public int sumOfNodes(Node root){
            if(root == null)    return 0;
            int sumofleft = sumOfNodes(root.left);
            int sumOfright = sumOfNodes(root.right);
            return root.data + sumOfright + sumofleft;
        }

        public int height(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return 1 + Math.max(leftHeight,rightHeight);
        }

        public int diameter(Node root){
            if(root == null) return 0;
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;
            return Math.max(diam3, Math.max(diam2, diam1));
        }

        public static class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int ht, int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }

        public TreeInfo diameter2(Node root){
            if(root == null)    return new TreeInfo(0, 0);
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
            int myHeight = Math.max(left.ht, right.ht) + 1;
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;
            int myDiam = Math.max(Math.max(diam1, diam2), diam3);
            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        // bt.preOrder(root);
        // System.out.println();
        // bt.inOrder(root);
        // System.out.println();
        // bt.postOrder(root);
        // System.out.println();
        bt.levelOrder(root);
        // System.out.println(bt.countNodes(root));
        // System.out.println(bt.sumOfNodes(root));
        // System.out.println(bt.height(root));
        // System.out.println(bt.diameter(root));
        System.out.println(bt.diameter2(root).diam);
    }
}