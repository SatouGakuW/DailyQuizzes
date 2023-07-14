package a7_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);

        TreeNode node1 = new TreeNode(2, node3, node4);
        TreeNode node2 = new TreeNode(3, node5, null);

        TreeNode node0 = new TreeNode(1, node1, node2);
        System.out.println(q222s1(node0));
    }

    public static int q222s1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int result = 0;
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            result++;
            if (curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);
        }
        return result;
    }
}
