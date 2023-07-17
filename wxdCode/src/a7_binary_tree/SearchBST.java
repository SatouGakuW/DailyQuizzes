package a7_binary_tree;

public class SearchBST {
    public static void main(String[] args) {
        Tools tool = new Tools();
        int[] pre = {4, 2, 1, 3, 7};
        int[] in = {1, 2, 3, 4, 7};
        TreeNode root = tool.buildTreeByInAndPre(in, pre);
        tool.printTreeInLevelOrder(q700s1(root, 2));
    }
    public static TreeNode q700s1(TreeNode root, int val) {
        TreeNode curr = root;
        while (curr != null) {
            if (val > curr.val) {
                curr = curr.right;
            } else if (val < curr.val) {
                curr = curr.left;
            } else {
                break;
            }
        }
        return curr;
    }
}
