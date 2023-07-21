package a7_binary_tree;

public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        Q108 q108 = new Q108();
        Tools tools = new Tools();
        tools.printTreeInLevelOrder(q108.solution1(nums));
    }
}

class Q108 {
    public TreeNode solution1(int[] nums) {
        TreeNode root = traversal(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode traversal(int[] nums, int left, int right) {
        // 区间非法
        if (left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traversal(nums, left, mid - 1);
        root.right = traversal(nums, mid + 1, right);
        return root;
    }
}