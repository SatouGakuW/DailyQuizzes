package a7_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);

        TreeNode node0 = new TreeNode(2, node1, node2);
        System.out.println(q513s1(node0));
    }

    public static int q513s1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int result = 0;
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size(), i = size;
            while (i-- > 0) {
                TreeNode curr = queue.poll();
                if (i == size - 1) {
                    result = curr.val;
                }
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
        }
        return result;
    }
}
