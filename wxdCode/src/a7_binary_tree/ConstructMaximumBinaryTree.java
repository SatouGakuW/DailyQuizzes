package a7_binary_tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ConstructMaximumBinaryTree {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        q654s1(nums);
    }

    public static TreeNode q654s1(int[] nums) {
        if (nums.length == 0)
            return null;
        if (nums.length == 1) {
            TreeNode root = new TreeNode(nums[0]);
            return root;
        }
        return findNode(nums, 0, nums.length);
    }

    public static TreeNode findNode(int[] nums, int begin, int end) {
        if (begin >= end)
            return null;
        int max = nums[begin];
        int rootIdx = begin;
        for (int i = begin; i < end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                rootIdx = i;
            }
        }
        TreeNode root = new TreeNode(nums[rootIdx]);
        root.left = findNode(nums, begin, rootIdx);
        root.right = findNode(nums, rootIdx + 1, end);
        return root;
    }
}
