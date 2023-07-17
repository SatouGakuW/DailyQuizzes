package daimasuixianglu.a7_binary_tree.d20;

import java.util.ArrayList;
import java.util.List;

public class Q199_2 {
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
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    public void dfs(TreeNode node , int level){
        if(node == null)
            return;
        if(res.size() == level){
            res.add(node.val);
        }
        dfs(node.right,level +1);
        dfs(node.left,level + 1);
    }
}
