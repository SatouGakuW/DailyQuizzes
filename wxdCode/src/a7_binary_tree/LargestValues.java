package a7_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.Integer.MIN_VALUE;

public class LargestValues {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(9);

        TreeNode node1 = new TreeNode(3, node3, node4);
        TreeNode node2 = new TreeNode(2, null, node5);

        TreeNode node0 = new TreeNode(1, node1, node2);
        System.out.println(q515s1(node0));
    }

    public static List<Integer> q515s1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = MIN_VALUE;
            while (size-- > 0) {
                TreeNode curr = queue.poll();
                if (curr.val > max)
                    max = curr.val;
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            result.add(max);
        }
        return result;
    }
}
