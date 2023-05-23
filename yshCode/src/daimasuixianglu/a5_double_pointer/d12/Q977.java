package daimasuixianglu.a5_double_pointer.d12;

public class Q977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] ans = new int[nums.length];
        int index = nums.length - 1;
        for (; left <= right; ) {
            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                ans[index] = nums[left] * nums[left];
                left++;
            }else{
                ans[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return ans;
    }
}
