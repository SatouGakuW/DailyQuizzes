package a7_binary_tree;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20, node3, node4);

        TreeNode node0 = new TreeNode(3, node1, node2);
        System.out.println(q404s1(node0));
    }

    // 后序，遍历完左右子树之后才能知道当前节点有没有左子树的左孩子
    public static int q404s1(TreeNode root) {
        // 递归终点
        // 空
        if (root == null)
            return 0;
        // 叶节点
        if (root.left == null && root.right == null)
            return 0;
        // 左
        int leftValue = q404s1(root.left);
        // 什么是左子树的叶子
        // 当前节点有左孩子 && 左孩子是叶子
        // 更新leftValue
        if (root.left != null && root.left.left == null && root.left.right == null) {
            leftValue = root.left.val;
        }
        // 右
        int rightValue = q404s1(root.right);
        return leftValue + rightValue;
    }
}
