class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    int i = 0;
    public TreeNode solve(int[] preorder, int min, int max){
        if(i == preorder.length)    return null;
        TreeNode root = null;
        if(preorder[i] > min && preorder[i] < max){
            root = new TreeNode(preorder[i++]);
            root.left = solve(preorder, min, root.val);
            root.right = solve(preorder, root.val, max);
        }
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return solve(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}