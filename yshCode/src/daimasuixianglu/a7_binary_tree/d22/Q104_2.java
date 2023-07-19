package daimasuixianglu.a7_binary_tree.d22;

import java.util.Deque;
import java.util.LinkedList;

public class Q104_2 {
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

    public int maxDepth(TreeNode root) {
       if(root == null)
           return 0;
       int depth = 0;
       Deque<TreeNode> deque = new LinkedList<>();
       deque.add(root);
       while (!deque.isEmpty()){
           depth++;
           int size = deque.size();
           TreeNode node ;
           for(int i = 0; i < size; i++){
               node = deque.poll();
               if(node.left != null)
                   deque.add(node.left);
               if(node.right != null)
                   deque.add(node.right);
           }
       }
       return depth;
    }
}
