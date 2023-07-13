package daimasuixianglu.a7_binary_tree.d18;

import java.util.ArrayList;
import java.util.List;

public class Q94 {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root != null){
            dfs(root, res);
        }
        return res;
    }
    private void dfs(TreeNode root, List<Integer> res){
        if(root != null){
            dfs(root.left, res);
            res.add(root.val);
            dfs(root.right,res);
        }
    }
}
