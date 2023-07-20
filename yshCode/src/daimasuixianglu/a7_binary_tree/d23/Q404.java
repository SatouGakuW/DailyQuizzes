package daimasuixianglu.a7_binary_tree.d23;

public class Q404 {

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

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        int leftValue = sumOfLeftLeaves(root.left);
        int rightValue = sumOfLeftLeaves(root.right);
        int midValue = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            midValue += root.left.val;
        }
        int sum = midValue + leftValue + rightValue;
        return sum;
    }

}
