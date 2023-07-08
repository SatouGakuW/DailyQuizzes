package a7_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;
        System.out.println(q144s1(node1));
    }

    public static List<Integer> q144s1(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        preorder(root, vec);
        return vec;
    }

    // 递归
    public static void preorder(TreeNode curr, List<Integer> vec) {
        // 递归终止条件
        if (curr == null)
            return;
        // 中
        vec.add(curr.val);
        // 左
        preorder(curr.left, vec);
        // 右
        preorder(curr.right, vec);
    }
}
