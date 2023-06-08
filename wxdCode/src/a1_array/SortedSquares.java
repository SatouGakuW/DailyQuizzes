package a1_array;

import java.util.Arrays;

// Leetcode Q977
// 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
public class SortedSquares {
    public static void main(String[] args) {
//        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums = {-7, -3, 2, 3, 11};
        int[] ans = pointerSolution(nums);
        for (int num : ans) {
            System.out.printf("%d ", num);
        }
    }

    public static int[] naiveSolution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] pointerSolution(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int k = nums.length - 1;
        while (left <= right) {
            int sqLeft = nums[left] * nums[left], sqRight = nums[right] * nums[right];
            if (sqLeft > sqRight) {
                result[k--] = sqLeft;
                left++;
            } else {
                result[k--] = sqRight;
                right--;
            }
        }
        return result;
    }
}
