package daimasuixianglu.a7_binary_tree.d24;

import java.util.Deque;
import java.util.LinkedList;

public class Q513_3 {

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


    public int findBottomLeftValue(TreeNode root) {
        if(root == null)
            return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        TreeNode bottomLeft = null;
        while(!deque.isEmpty()){
            int size = deque.size();
            for(int i = 0; i < size; i++){
                bottomLeft = deque.poll();
                if(bottomLeft.right != null)
                    deque.add(bottomLeft.right);
                if(bottomLeft.left != null)
                    deque.add(bottomLeft.left);
            }
        }
        return bottomLeft.val;
    }


}

