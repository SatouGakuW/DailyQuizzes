package daimasuixianglu.a7_binary_tree.d21;

public class Q111_2 {

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

    public int minDepth(TreeNode root) {
        if(root ==  null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int ml = minDepth(root.left);
        int mr = minDepth(root.right);
        if(root.left == null || root.right == null)
            return ml + mr + 1;
        return ml <= mr ? ml + 1 : mr + 1;
    }

}
