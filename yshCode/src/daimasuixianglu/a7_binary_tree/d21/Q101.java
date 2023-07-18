package daimasuixianglu.a7_binary_tree.d21;

public class Q101 {

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

    // 收集孩子的信息只能使用递归
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right){
        if(left == null && right != null)
            return false;
        if(left != null && right == null)
            return false;
        if(left == null && right == null)
            return true;
        if(left.val != right.val)
            return false;
        boolean compareOutside = compare(left.left, right.right);
        boolean compareInside = compare(left.right, right.left);
        return compareOutside && compareInside;
    }

}
