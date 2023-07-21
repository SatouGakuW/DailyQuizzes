package daimasuixianglu.a7_binary_tree.d24;

public class Q112 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            if(targetSum-root.val == 0)
                return true;
            return false;
        }
        boolean leftPath = hasPathSum(root.left, targetSum-root.val);
        boolean rightPath = hasPathSum(root.right, targetSum-root.val);
        return leftPath || rightPath;
    }


}
