package a7_binary_tree;

import java.util.*;

public class LevelOrderBottom {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(7);
        TreeNode node3 = new TreeNode(15);
        TreeNode node2 = new TreeNode(20, node3, node4);
        TreeNode node1 = new TreeNode(9);
        TreeNode node0 = new TreeNode(3,node1, node2);
        System.out.println(q107s1(node0));
    }

    public static List<List<Integer>> q107s1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> st = new Stack<>();
        List<List<Integer>> results = new ArrayList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> result = new ArrayList<>();
            while (size-- > 0) {
                TreeNode curr = queue.poll();
                result.add(curr.val);
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            st.push(result);
        }
        while (!st.isEmpty()) {
            results.add(st.pop());
        }
        return results;
    }
}
