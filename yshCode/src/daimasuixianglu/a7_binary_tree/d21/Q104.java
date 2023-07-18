package daimasuixianglu.a7_binary_tree.d21;

import java.util.Deque;
import java.util.LinkedList;

public class Q104 {


    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public int maxDepth(TreeNode root) {
        int depth = 0;
       if(root == null)
           return depth;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            if(size > 0)
                depth++;
            for(int i = 0; i < size; i++){
                TreeNode node = deque.poll();
                if(node.left != null)
                    deque.add(node.left);
                if(node.right != null){
                    deque.add(node.right);
                }
            }
        }
        return depth;

    }

}
