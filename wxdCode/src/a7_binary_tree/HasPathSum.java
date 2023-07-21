package a7_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class HasPathSum {
    public static void main(String[] args) {
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(5);
        TreeNode node9 = new TreeNode(1);

        TreeNode node3 = new TreeNode(11, node6, node7);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4, node8, node9);

        TreeNode node1 = new TreeNode(4, node3, null);
        TreeNode node2 = new TreeNode(8, node4, node5);

        TreeNode node0 = new TreeNode(5, node1, node2);

        Q113 q113 = new Q113();
        System.out.println(q113.solution1(node0, 22));
    }


}

class Q112 {
    // 根据BinaryTreePaths改的
    public boolean solution1(TreeNode root, int targetSum) {
        List<Integer> paths = new ArrayList<>();
        List<Integer> sums = new ArrayList<>();
        traversal112(root, paths, sums);
        for (int i : sums) {
            if (targetSum == i)
                return true;
        }
        return false;
    }

    public void traversal112(TreeNode root, List<Integer> paths, List<Integer> sums) {
        if (root == null)
            return;
        // 中
        paths.add(root.val);
        // 遍历到叶子 递归终止
        if (root.left == null && root.right == null) {
            // path 变成 sum
            int sum = 0;
            for (int i : paths) {
                sum += i;
            }
            sums.add(sum);
            return;
        }
        // 左
        if (root.left != null) {
            traversal112(root.left, paths, sums);
            paths.remove(paths.size() - 1);
        }
        // 右
        if (root.right != null) {
            traversal112(root.right, paths, sums);
            paths.remove(paths.size() - 1);
        }
    }

    public boolean solution2(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        targetSum -= root.val;
        // 遍历到叶子 递归终止
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        // 左
        if (root.left != null) {
            if (solution2(root.left, targetSum))
                return true;
        }
        // 右
        if (root.right != null) {
            if (solution2(root.right, targetSum))
                return true;
        }
        return false;
    }
}

class Q113 {
    public List<List<Integer>> solution1(TreeNode root, int targetSum) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> paths = new ArrayList<>();
        traversal(root, paths, targetSum, results);
        return results;
    }

    public void traversal(TreeNode root, List<Integer> path, int target, List<List<Integer>> results) {
        if (root == null)
            return;
        // 中
        target -= root.val;
        path.add(root.val);
        // 终止条件
        if (root.left == null && root.right == null) {
            if (target == 0) {
                // 这块必须深拷贝
                List<Integer> clonedpath = new ArrayList<>(path);
                results.add(clonedpath);
            }
            return;
        }
        // 左
        if (root.left != null) {
            traversal(root.left, path, target, results);
            // 回溯
            path.remove(path.size() - 1);
        }
        // 右
        if (root.right != null) {
            traversal(root.right, path, target, results);
            // 回溯
            path.remove(path.size() - 1);
        }
    }

}