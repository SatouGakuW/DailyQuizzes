package a7_binary_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node1 = new TreeNode(4, node3, node4);
        TreeNode node0 = new TreeNode(5, node1, node2);
        System.out.println(q145s2(node0));
    }

    // 递归
    public static List<Integer> q145s1(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        postorder(root, vec);
        return vec;
    }

    public static void postorder(TreeNode curr, List<Integer> vec) {
        // 终止条件
        if (curr == null) {
            return;
        }

        // 左
        postorder(curr.left, vec);
        // 右
        postorder(curr.right, vec);
        // 中
        vec.add(curr.val);
    }

    // 迭代，在前序遍历基础上修改
    // 前序遍历的代码逻辑是 中->右->左 来模拟出 中->左->右
    // 因此将代码逻辑变为 中->左->右 可以模拟出 中->右->左
    // 最后将得到的数组反转就得到了 左->右->中
    public static List<Integer> q145s2(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            if (curr != null)
                vec.add(curr.val);
            else
                continue;
            st.push(curr.left);
            st.push(curr.right);
        }
        Collections.reverse(vec);
        return vec;
    }
}
