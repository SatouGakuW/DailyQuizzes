package daimasuixianglu.a7_binary_tree.d20;

import java.util.*;

public class Q515 {

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

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        if(root == null)
            return res;
        deque.add(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            TreeNode node = null;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                 node = deque.poll();
                 max = Math.max(max,node.val);
                 if(node.left != null)
                     deque.add(node.left);
                 if(node.right != null)
                     deque.add(node.right);
            }
            res.add(max);
        }
        return res;
    }

}
