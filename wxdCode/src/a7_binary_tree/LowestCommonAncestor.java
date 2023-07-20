package a7_binary_tree;

public class LowestCommonAncestor {
    public static void main(String[] args) {

    }
}

class Q236 {
    // 后序
    // 左子树中出现了 p or q 就往上返回，右子树同理
    // 如果某个节点左右子树的返回值都不为空，它就是最近的公共祖先了
    // 一个节点是另一个的祖先的情况也可以处理
    public TreeNode solution1(TreeNode root, TreeNode p, TreeNode q) {
        // 两种情况：没找到(root == null) + 遇到了 p or q
        if (root == null || root == p || root == q)
            return root;
        // 左，left告诉我们左子树有没有出现过p和q
        TreeNode left = solution1(root.left, p, q);
        // 右，目的同理
        TreeNode right = solution1(root.right, p, q);
        // 中
        // 如果left和right都不是空，就说明找到了
        if (left != null && right != null)
            return root;
        // left 空，right 不空，向上返回right
        else if (left == null && right != null)
            return right;
        // left 不空，right 空，向上返回left
        else if (left != null && right == null)
            return left;
        else
            return null;
    }
}

class Q235 {
    // 从上向下去递归遍历，第一次遇到 cur节点是数值在[p, q]区间中，那么cur就是 p和q的最近公共祖先。
    public TreeNode solution1(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        if (q.val < p.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        while (curr != null) {
            if (curr.val >= p.val && curr.val <= q.val) {
                break;
            } else if (curr.val < p.val) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        return curr;
    }
}