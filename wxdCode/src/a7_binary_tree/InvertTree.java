package a7_binary_tree;

public class InvertTree {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);

        TreeNode node1 = new TreeNode(2, node3, node4);
        TreeNode node2 = new TreeNode(7, node5, node6);

        TreeNode node0 = new TreeNode(4, node1, node2);
        node0 = q226s1(node0);
        Tools tools = new Tools();
        tools.printTreeInLevelOrder(node0);
    }

    public static TreeNode q226s1(TreeNode root) {
        preorder(root);
        return root;
    }

    // 不可以用中序
    // 举例：[[4], [2, 7], [1, 3, 6, 9]] -> [[4], [7, 2], [6, 9, 1, 3]]
    public static void preorder(TreeNode curr) {
        // 终点
        if (curr == null)
            return;
        // 中
        TreeNode tmp = curr.left;
        curr.left = curr.right;
        curr.right = tmp;
        // 左
        preorder(curr.left);
        // 右
        preorder(curr.right);
    }
}
