package a1_array;

// Leetcode Q27
// 给定数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
public class RemovingElements {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 2, 3};
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int val = 3;
        int val = 2;
        int ans = rmElements(nums, val);
        System.out.println(ans);
    }

    // code here
    public static int rmElements(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
//                上面两句也可以合并为
//                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
