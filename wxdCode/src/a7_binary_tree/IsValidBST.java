package a7_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class IsValidBST {
    public static boolean q98s1(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        inorder(root, vec);
        for (int i = 0; i < vec.size() - 1; i++) {
            if (vec.get(i) >= vec.get(i + 1))
                return false;
        }
        return true;
    }

    public static void inorder(TreeNode root, List<Integer> vec) {
        if (root == null)
            return;
        inorder(root.left, vec);
        vec.add(root.val);
        inorder(root.right, vec);
    }
}
