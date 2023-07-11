package a7_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        // q102
//        TreeNode node4 = new TreeNode(7);
//        TreeNode node3 = new TreeNode(15);
//        TreeNode node2 = new TreeNode(20, node3, node4);
//        TreeNode node1 = new TreeNode(9);
//        TreeNode node0 = new TreeNode(3,node1, node2);
//        System.out.println(q102s1(node0));

        // q429
        Node node5 = new Node(6);
        Node node4 = new Node(5);
        List<Node> nodeList1 = new ArrayList<>();
        nodeList1.add(node4);
        nodeList1.add(node5);
        Node node3 = new Node(4);
        Node node2 = new Node(2);
        Node node1 = new Node(3, nodeList1);
        List<Node> nodeList0 = new ArrayList<>();
        nodeList0.add(node1);
        nodeList0.add(node2);
        nodeList0.add(node3);
        Node node0 = new Node(1, nodeList0);
        System.out.println(q429s1(node0));
    }

    // 思路：用size记录这一层有几个节点，即需要弹出几个
    public static List<List<Integer>> q102s1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> results = new ArrayList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> result = new ArrayList<>();
            while (size-- > 0) {
                TreeNode curr = queue.poll();
                result.add(curr.val);
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            results.add(result);
        }
        return results;
    }

    public static List<List<Integer>> q429s1(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> results = new ArrayList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> result = new ArrayList<>();
            while (size-- > 0) {
                Node curr = queue.poll();
                result.add(curr.val);
                if (curr.children != null) {
                    queue.addAll(curr.children);
                }
            }
            results.add(result);
        }
        return results;
    }
}
