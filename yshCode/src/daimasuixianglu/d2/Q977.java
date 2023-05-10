package daimasuixianglu.d2;

public class Q977 {
    public int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0)
            return nums;
        int len = nums.length;
        int[] ans = new int[len];
        int pos = len - 1;
        for(int i = 0, j = len -1;  i <= j; ){
            if(nums[i] * nums[i] >= nums[j] * nums[j]){
                ans[pos] = nums[i] * nums[i];
                i++;
            }else{
                ans[pos] = nums[j] * nums[j];
                j--;
            }
            pos--;
        }
        return ans;
    }
}
