package daimasuixianglu.a7_binary_tree.d23;

import java.util.Deque;
import java.util.LinkedList;

public class Q222_2 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int counts = 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            counts += size;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                if(node.left != null)
                    deque.add(node.left);
                if(node.right != null)
                    deque.add(node.right);
            }
        }
        return counts;
    }


}
