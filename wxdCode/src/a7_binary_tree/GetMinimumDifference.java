package a7_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class GetMinimumDifference {
    public static void main(String[] args) {
        int[] inorder = {1, 2, 3, 4, 6};
        int[] preorder = {4, 2, 1, 3, 6};
        Tools tools = new Tools();
        TreeNode root = tools.buildTreeByInAndPre(inorder, preorder);
        System.out.println(q530s1(root));
    }

    public static int q530s1(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        traverse(root, vec);
        int minDiff = vec.get(1) - vec.get(0);
        for (int i = 1; i < vec.size() - 1; i++) {
            int diff = vec.get(i + 1) - vec.get(i);
            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }

    public static void traverse(TreeNode curr, List<Integer> vec) {
        if (curr == null)
            return;
        traverse(curr.left, vec);
        vec.add(curr.val);
        traverse(curr.right, vec);
    }
}
