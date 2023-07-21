package a7_binary_tree;

public class TrimBST {
    public static void main(String[] args) {

    }
}

class Q669 {
    public TreeNode solution1(TreeNode root, int low, int high) {
        if (root == null)
            return null;
        if (root.val < low) {
            TreeNode right = solution1(root.right, low, high);
            return right;
        }
        if (root.val > high) {
            TreeNode left = solution1(root.left, low, high);
            return left;
        }
        root.left = solution1(root.left, low, high);
        root.right = solution1(root.right, low, high);
        return root;
    }
}