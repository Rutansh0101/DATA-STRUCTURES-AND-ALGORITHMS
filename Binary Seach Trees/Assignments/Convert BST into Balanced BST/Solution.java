import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {

    public void findInorder(TreeNode root, ArrayList<Integer> inorder){
        if(root == null)    return;
        findInorder(root.left, inorder);
        inorder.add(root.val);
        findInorder(root.right, inorder);
        return;
    }

    public TreeNode solve(ArrayList<Integer> inorder, int start, int end){
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left = solve(inorder, start, mid-1);
        root.right = solve(inorder, mid+1, end);
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        findInorder(root, inorder);
        return solve(inorder, 0, inorder.size()-1);
    }
}