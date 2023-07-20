package a7_binary_tree;

public class InsertIntoBST {
    public static void main(String[] args) {
        int[] inorder = {1, 2, 3, 4, 7};
        int[] preorder = {4, 2, 1, 3, 7};
        Tools tools = new Tools();
        TreeNode root = tools.buildTreeByInAndPre(inorder, preorder);
        Q701 q701 = new Q701();
        tools.printTreeInLevelOrder(q701.solution1(root, 5));
    }
}

class Q701 {
    public TreeNode solution1(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        TreeNode curr = root, pre = null;
        while (curr != null) {
            if (val >= curr.val) {
                pre = curr;
                curr = curr.right;
            } else {
                pre = curr;
                curr = curr.left;
            }
        }
        if (val >= pre.val) {
            pre.right = new TreeNode(val);
        } else {
            pre.left = new TreeNode(val);
        }
        return root;
    }
}