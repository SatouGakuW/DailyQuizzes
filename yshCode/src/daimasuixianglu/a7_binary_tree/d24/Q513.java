package daimasuixianglu.a7_binary_tree.d24;

public class Q513 {

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

    private int deep = -1;
    private int result = 0;

    public int findBottomLeftValue(TreeNode root) {
        if(root != null){
            findLeftValue(root,0);
        }
        return result;
    }

    private void findLeftValue(TreeNode node, int depth){

        if(node.left == null && node.right == null){
            if(depth > deep){
                deep = depth;
                result = node.val;
            }
        }
        if(node.left != null)
            findLeftValue(node.left,depth+1);
        if(node.right != null)
            findLeftValue(node.right, depth + 1);
    }

}

