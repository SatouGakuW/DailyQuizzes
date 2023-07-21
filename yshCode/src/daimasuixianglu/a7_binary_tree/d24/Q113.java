package daimasuixianglu.a7_binary_tree.d24;

import java.util.LinkedList;
import java.util.List;

public class Q113 {

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

    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return res;
        pathSum(root, targetSum,new LinkedList<>());
        return res;

    }
    public void pathSum(TreeNode node, int targetSum, List<Integer> path) {
        if(node == null)
            return;
        path.add(node.val);
        if(node.left == null && node.right == null && targetSum-node.val == 0){
            res.add(new LinkedList<>(path));
        }
        if(node.left != null){
            pathSum(node.left, targetSum-node.val, path);
            path.remove(path.size()-1);
        }
        if(node.right != null){
            pathSum(node.right, targetSum-node.val, path);
            path.remove(path.size()-1);
        }
    }



}
