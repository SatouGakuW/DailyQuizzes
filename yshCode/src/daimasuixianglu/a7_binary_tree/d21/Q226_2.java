package daimasuixianglu.a7_binary_tree.d21;

import java.util.Deque;
import java.util.LinkedList;

public class Q226_2 {

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

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {return null;}
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            for(int i = 0; i < size; i++){
                TreeNode node = deque.poll();
                swap(node);
                if(node.left != null)
                    deque.add(node.left);
                if(node.right != null)
                    deque.add(node.right);
            }
        }
        return root;
    }

    public void swap(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }




}
