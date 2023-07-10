package a7_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3, null, node4);
        TreeNode node1 = new TreeNode(2, null, node3);
        TreeNode node0 = new TreeNode(1, node1, node2);
        System.out.println(q199s1(node0));
    }

    public static List<Integer> q199s1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> results = new ArrayList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode curr = queue.poll();
                if (size == 0)
                    results.add(curr.val);
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
        }
        return results;
    }
}
