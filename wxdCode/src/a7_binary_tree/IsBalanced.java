package a7_binary_tree;

public class IsBalanced {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20, node3, node4);

        TreeNode node0 = new TreeNode(3, node1, node2);
        System.out.println(q110s1(node0));
    }

    public static boolean q110s1(TreeNode root) {
        if (root == null)
            return true;
        if (getDepth(root) == -1)
            return false;
        return true;
    }

    // -1 表示已经不是平衡二叉树了，否则返回值是以该节点为根的树的高度
    public static int getDepth(TreeNode curr) {
        // 终止条件
        if (curr == null)
            return 0;
        // 左子树高度
        int leftDepth = getDepth(curr.left);
        // 如果左子树已经不平衡了，就直接返回，右子树同理
        if (leftDepth == -1)
            return -1;
        int rightDepth = getDepth(curr.right);
        if (rightDepth == -1)
            return -1;

        int result;
        // 左右子树高度差 > 1，不平衡
        if (Math.abs(leftDepth - rightDepth) > 1) {
            result = -1;
        } else {
            // 树高 + 1
            result = 1 + Math.max(leftDepth, rightDepth);
        }
        return result;
    }
}
