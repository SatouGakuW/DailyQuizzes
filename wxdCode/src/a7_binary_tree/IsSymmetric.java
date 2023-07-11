package a7_binary_tree;

public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);

        TreeNode node1 = new TreeNode(2, node3, node4);
        TreeNode node2 = new TreeNode(2, node5, node6);

        TreeNode node0 = new TreeNode(1, node1, node2);
        System.out.println(q101s1(node0));

    }

    // 只能用后序：因为要不断收集左右孩子的信息返回给父节点
    // 上述情况的题目就只能用后序遍历
    public static boolean q101s1(TreeNode root) {
        return compare(root.left, root.right);
    }

    // 函数传入参数：左子树 & 右子树
    public static boolean compare(TreeNode left, TreeNode right) {
        // 终止条件
        // 左空右不空，false
        if (left == null && right != null) {
            return false;
        }
        // 左不空右空，false
        else if (left != null && right == null) {
            return false;
        }
        // 左右都空，true
        else if (left == null && right == null) {
            return true;
        }
        // 左右都不空，但值不等，false
        else if (left.val != right.val) {
            return false;
        }

        // 外侧，左子树的左边 and 右子树的右边
        boolean outside = compare(left.left, right.right);
        // 内侧，左子树的右边 and 右子树的左边
        boolean inside = compare(left.right, right.left);
        // 当前节点，左右都对称为true
        return outside && inside;
    }
}
