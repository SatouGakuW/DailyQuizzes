package a7_binary_tree;

import java.util.Stack;

public class MergeTrees {
    public static void main(String[] args) {
        Q617 q617 = new Q617();
    }
}

class Q617 {
    public TreeNode solution1(TreeNode root1, TreeNode root2) {
        // 终止
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        // 中
        root1.val += root2.val;
        // 左
        root1.left = solution1(root1.left, root2.left);
        // 右
        root1.right = solution1(root1.right, root2.right);
        return root1;
    }
}