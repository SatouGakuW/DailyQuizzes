package daimasuixianglu.a7_binary_tree.d23;

public class Q110 {

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

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = getHeight(root.left);
        if (leftHeight == -1)
            return - 1;
        int rightHeight = getHeight(root.right);
        if (rightHeight == -1)
            return - 1;
        int result = 0;
        if (Math.abs(leftHeight - rightHeight) > 1)
            result = - 1;
        else
            result = Math.max(leftHeight, rightHeight) + 1;
        return result;
    }

}
