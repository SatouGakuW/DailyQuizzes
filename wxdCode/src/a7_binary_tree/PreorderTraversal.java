package a7_binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node1 = new TreeNode(4, node3, node4);
        TreeNode node0 = new TreeNode(5, node1, node2);
        System.out.println(q144s2(node0));
    }

    // 递归
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

    // 迭代
    public static List<Integer> q144s2(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            // 中
            if (curr != null)
                vec.add(curr.val);
            else
                continue;
            // 左右节点是null的话，也会入栈，st.pop()行会将null的弹出
            // 因此在加入vec前需要判断弹出的是否为空
            st.push(curr.right);    // 右
            st.push(curr.left);     // 左
        }
        return vec;
    }
}
