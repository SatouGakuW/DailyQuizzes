package daimasuixianglu.a7_binary_tree.d23;

import java.util.ArrayList;
import java.util.List;

public class Q257 {

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

    List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return res;
        List<Integer> path = new ArrayList<>();
        dfs(root,path);
        return res;
    }

    // 前序遍历
    public void dfs(TreeNode node, List<Integer>path){
        path.add(node.val);
        if(node.left == null && node.right == null){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < path.size() - 1; i++){
                sb.append(path.get(i)+"->");
            }
            sb.append(path.get(path.size()-1));
            res.add(sb.toString());
        }
        if(node.left != null){
            dfs(node.left,path);
            path.remove(path.size()-1);
        }
        if(node.right != null){
            dfs(node.right, path);
            path.remove(path.size()-1);
        }
    }

}
