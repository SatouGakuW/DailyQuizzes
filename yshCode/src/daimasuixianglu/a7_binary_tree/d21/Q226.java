package daimasuixianglu.a7_binary_tree.d21;

public class Q226 {

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

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode leftNode = root.left;
        root.left = root.right;
        root.right = leftNode;
        invertTree(root.left);
        invertTree(root.right);
        return root;

    }


    public TreeNode init(){
        TreeNode root = new TreeNode(4);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(7);
        root.left = l1 ;
        root.right = r1;
        TreeNode l1l = new TreeNode(1);
        TreeNode l1r = new TreeNode(3);
        l1.left = l1l;
        l1.right = l1r;
        TreeNode r1l = new TreeNode(6);
        TreeNode r1r = new TreeNode(9);
        r1.left = r1l;
        r1.right = r1r;
        return root;
    }

    public static void main(String[] args) {
        Q226 q226 = new Q226();
        TreeNode root = q226.init();
        TreeNode newRoot = q226.invertTree(root);
        System.out.println();
    }

}
