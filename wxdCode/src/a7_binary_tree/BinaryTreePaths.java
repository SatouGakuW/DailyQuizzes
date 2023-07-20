package a7_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(5);

        TreeNode node1 = new TreeNode(2, null, node3);
        TreeNode node2 = new TreeNode(3);

        TreeNode node0 = new TreeNode(1, node1, node2);
        Q257 q257 = new Q257();
        System.out.println(q257.solution1(node0));
    }

}

class Q257 {
    public List<String> solution1(TreeNode root) {
        List<String> result = new ArrayList<>();
        List<Integer> paths = new ArrayList<>();
        traversal(root, paths, result);
        return result;
    }

    // 这题要用前序遍历，让路径中父节点指向子节点
    public void traversal(TreeNode root, List<Integer> paths, List<String> result) {
        // 中
        // 这题的 中 要写在终止条件的前面，因为终止条件的时候直接返回了，叶子节点还没有加入path里
        paths.add(root.val);

        // 终止条件：走到叶子节点了
        if (root.left == null && root.right == null) {
            // 在遍历的过程中，节点被添加到paths里，因此遍历到叶节点的时候，就是一条完整的path了
            // 因此递归终点就是要把path放进result里
            // Integer转成String
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paths.size() - 1; i++) {
                sb.append(paths.get(i)).append("->");
            }
            sb.append(paths.get(paths.size() - 1));

            // 放进result里
            result.add(sb.toString());
            return;
        }

        // 左
        // 为了防止终止条件处出现空指针异常，往左走之前先判断
        if (root.left != null) {
            traversal(root.left, paths, result);
            // remove作用：回溯
            // 现有 1-2-5 的路径，如何得到 1-3？
            // Ans：先弹出去
            paths.remove(paths.size() - 1);
        }

        // 右
        if (root.right != null) {
            traversal(root.right, paths, result);
            paths.remove(paths.size() - 1);
        }
    }

}