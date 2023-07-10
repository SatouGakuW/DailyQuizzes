package a7_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(7);
        TreeNode node3 = new TreeNode(15);
        TreeNode node2 = new TreeNode(20, node3, node4);
        TreeNode node1 = new TreeNode(9);
        TreeNode node0 = new TreeNode(3,node1, node2);
        System.out.println(q107s1(node0));
    }

    public static List<List<Integer>> q107s1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> results = new ArrayList<>();
        // TODO:
        return results;
    }
}
