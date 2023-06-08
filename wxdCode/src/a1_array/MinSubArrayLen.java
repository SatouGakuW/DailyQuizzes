package a1_array;

// Leetcode Q209
// 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。
// 如果不存在符合条件的子数组，返回 0。
public class MinSubArrayLen {
    public static void main(String[] args) {
        int[][] nums = {
                {2, 3, 1, 2, 4, 3},
                {1, 4, 4},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };
        int[] target = {7, 4, 11};
        for (int i = 0; i < target.length; i++) {
            int ans = swSolution(target[i], nums[i]);
            System.out.println(ans);
        }
    }

    public static int naiveSolution(int target, int[] nums) {
        int min = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target && (j - i + 1) < min)
                    min = j - i + 1;
            }
        }
        if (min == nums.length + 1)
            return 0;
        return min;
    }

    public static int swSolution(int target, int[] nums) {
        int sum = 0, result = Integer.MAX_VALUE;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                int sumL = j - i + 1;
                result = Math.min(sumL, result);
                sum -= nums[i++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
