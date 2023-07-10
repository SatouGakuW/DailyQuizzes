package a7_binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node1 = new TreeNode(4, node3, node4);
        TreeNode node0 = new TreeNode(5, node1, node2);
        System.out.println(q94s2(node0));
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

    // 迭代，中序遍历每次访问到的节点和要处理的节点是不一样的，所以不能采用和前序遍历一样的思路。
    // 大致思路是 一路向左访问左孩子并入栈
    // 如果左孩子为空就出栈，用curr暂存一下这个节点，然后处理它（eg. 把curr.val加入要返回的结果数组中）
    // 如果curr的右孩子不为空，就继续入栈；为空则继续出栈，重复上面的过程
    public static List<Integer> q94s2(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                vec.add(curr.val);
                curr = curr.right;
            }
        }
        return vec;
    }
}
