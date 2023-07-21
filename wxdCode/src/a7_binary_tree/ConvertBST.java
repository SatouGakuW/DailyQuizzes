package a7_binary_tree;

// TODO: 这题没学完
public class ConvertBST {
    public static void main(String[] args) {
        int[] inorder = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] preorder = {4, 1, 0, 2, 3, 6, 5, 7, 8};
        Tools tools = new Tools();
        TreeNode root = tools.buildTreeByInAndPre(inorder, preorder);
        Q538 q538 = new Q538();
        tools.printTreeInLevelOrder(q538.convertBST(root));
    }
}

class Q538 {
    int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        convertBST1(root);
        return root;
    }

    // 按右中左顺序遍历，累加即可
    public void convertBST1(TreeNode root) {
        if (root == null) {
            return;
        }
        convertBST1(root.right);
        sum += root.val;
        root.val = sum;
        convertBST1(root.left);
    }
}