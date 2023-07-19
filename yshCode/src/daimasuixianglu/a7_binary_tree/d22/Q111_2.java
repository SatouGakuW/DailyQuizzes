package daimasuixianglu.a7_binary_tree.d22;

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
    // 后序遍历
    public int minDepth(TreeNode root) {
       if(root == null)
           return 0;
       int ml = minDepth(root.left);
       int mr = minDepth(root.right);
       if(root.left == null || root.right == null)
           return 1 + ml + mr ;  // ml mr中有一个为0
        return ml <= mr ? 1 + ml : 1 + mr;
    }
}
