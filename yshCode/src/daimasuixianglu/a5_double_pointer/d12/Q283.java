package daimasuixianglu.a5_double_pointer.d12;

public class Q283 {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        for(int i = slow ; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
