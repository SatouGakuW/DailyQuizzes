package a7_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;
        System.out.println(q94s1(node1));
    }

    // 递归
    public static List<Integer> q94s1(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        inorder(root, vec);
        return vec;
    }

    public static void inorder(TreeNode curr, List<Integer> vec) {
        // 终止条件
        if (curr == null) {
            return;
        }
        // 左
        inorder(curr.left, vec);
        // 中
        vec.add(curr.val);
        // 右
        inorder(curr.right, vec);
    }
}
