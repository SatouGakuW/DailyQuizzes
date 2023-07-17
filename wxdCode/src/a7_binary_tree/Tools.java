package a7_binary_tree;

import java.util.*;

public class Tools {

    public void printTreeInLevelOrder(TreeNode root) {
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
        System.out.println(results);
    }

    Map<Integer, Integer> map;
    public TreeNode buildTreeByInAndPost(int[] inorder, int[] postorder) {
        // 数组为空 返回null
        if (postorder.length == 0)
            return null;
        // 如果只有一个节点 直接返回
        if (postorder.length == 1) {
            TreeNode root = new TreeNode(postorder[0]);
            return root;
        }

        // (key: 数值, value: 在中序数组里的索引)
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return findNodeByInAndPost(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    // 分割数组为左右子树
    // [inBegin, inEnd) postBegin和postEnd同理
    private TreeNode findNodeByInAndPost(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
        // 终止条件：区间非法
        if (inBegin >= inEnd || postBegin >= postEnd) {
            return null;
        }
        // 找到后序最后一个元素在中序数组里的位置，这个元素就是根节点，并可以将左右子树分开
        int rootIdx = map.get(postorder[postEnd - 1]);
        // 构造节点
        TreeNode root = new TreeNode(inorder[rootIdx]);
        // 左子树元素个数
        int lenOfLeft = rootIdx - inBegin;
        root.left = findNodeByInAndPost(inorder, inBegin, rootIdx,
                postorder, postBegin, postBegin + lenOfLeft);
        root.right = findNodeByInAndPost(inorder, rootIdx + 1, inEnd,
                postorder, postBegin + lenOfLeft, postEnd - 1);
        return root;
    }

    public TreeNode buildTreeByInAndPre(int[] inorder, int[] preorder) {
        if (preorder.length == 0)
            return null;
        if (preorder.length == 1) {
            TreeNode root = new TreeNode(preorder[0]);
            return root;
        }

        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return findNodeByInAndPre(inorder, 0, inorder.length, preorder, 0, preorder.length);
    }

    private TreeNode findNodeByInAndPre(int[] inorder, int inBegin, int inEnd, int[] preorder, int preBegin,
                                      int preEnd) {
        // 终止条件
        if (inBegin >= inEnd || preBegin >= preEnd) {
            return null;
        }
        // 前序的话 第一个元素是根节点，在中序中找到相应位置
        int rootIdx = map.get(preorder[preBegin]);
        // 新建节点
        TreeNode root = new TreeNode(inorder[rootIdx]);
        // 左
        int lenOfLeft = rootIdx - inBegin;
        root.left = findNodeByInAndPre(inorder, inBegin, rootIdx, preorder, preBegin + 1, preBegin + 1 + lenOfLeft);
        root.right = findNodeByInAndPre(inorder, rootIdx + 1, inEnd, preorder, preBegin + 1 + lenOfLeft, preEnd);
        return root;
    }
}
