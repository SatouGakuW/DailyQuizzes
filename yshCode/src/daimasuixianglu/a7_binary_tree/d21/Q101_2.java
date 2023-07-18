package daimasuixianglu.a7_binary_tree.d21;

import java.util.Deque;
import java.util.LinkedList;

public class Q101_2 {

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

    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root.left);
        deque.add(root.right);
        while(!deque.isEmpty()){
            TreeNode left = deque.removeFirst();
            TreeNode right = deque.removeLast();
            if(left == null && right == null)
                continue;
            if(left == null || right == null || left.val != right.val)
                return false;
            deque.addFirst(left.right);
            deque.addFirst(left.left);
            deque.addLast(right.left);
            deque.addLast(right.right);
        }
        return true;
    }


}
