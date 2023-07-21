package daimasuixianglu.a7_binary_tree.d24;

import java.util.Deque;
import java.util.LinkedList;

public class Q112_2 {

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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        Deque<TreeNode> deque = new LinkedList<>();
        Deque<Integer> sumDeque = new LinkedList<>();
        deque.add(root);
        sumDeque.add(root.val);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for(int i = 0; i < size; i++){
                TreeNode node = deque.poll();
                int sum = sumDeque.poll();
                if(node.left == null && node.right == null && sum == targetSum )
                    return true;
                if(node.left != null){
                    deque.add(node.left);
                    sumDeque.add(sum + node.left.val);
                }
                if(node.right != null){
                    deque.add(node.right);
                    sumDeque.add(sum + node.right.val);
                }
            }
        }
        return false;
    }


}
