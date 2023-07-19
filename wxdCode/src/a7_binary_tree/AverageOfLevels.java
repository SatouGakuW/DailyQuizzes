package a7_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(7);
        TreeNode node3 = new TreeNode(15);
        TreeNode node2 = new TreeNode(20, node3, node4);
        TreeNode node1 = new TreeNode(9);
        TreeNode node0 = new TreeNode(3,node1, node2);
        Q637 q637 = new Q637();
        System.out.println(q637.solution1(node0));
    }
}

class Q637 {
    public List<Double> solution1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> result = new ArrayList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0.;
            int i = size;
            while (i-- > 0) {
                TreeNode curr = queue.poll();
                sum += (double) curr.val;
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            sum /= size;
            result.add(sum);
        }
        return result;
    }
}