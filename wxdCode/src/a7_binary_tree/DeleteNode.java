package a7_binary_tree;

public class DeleteNode {
    public static void main(String[] args) {

    }
}

class Q450 {
    public TreeNode solution1(TreeNode root, int key) {
        // 终止条件 5种
        // 没找到，返回null
        if (root == null) {
            return null;
        }
        // 找到了
        if (root.val == key) {
            // 是叶节点，返回null，上一层递归会接住
            if (root.left == null && root.right == null) {
                return null;
            }
            // 只有左孩子，返回左孩子，让父节点接住
            else if (root.left != null && root.right == null) {
                return root.left;
            }
            // 只有右孩子，道理同上
            else if (root.left == null && root.right != null) {
                return root.right;
            }
            // 左右孩子都有，让右孩子即位，左子树挂在右子树最左侧的节点下
            else {
                // 找到右子树最左侧的节点
                TreeNode curr = root.right;
                while (curr.left != null) {
                    curr = curr.left;
                }
                curr.left = root.left;
                return root.right;
            }
        }

        if (key < root.val) {
            root.left = solution1(root.left, key);
        }
        if (key > root.val) {
            root.right = solution1(root.right, key);
        }

        // 左右子树都处理完之后就返回root
        return root;
    }
}