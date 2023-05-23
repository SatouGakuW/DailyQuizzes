package daimasuixianglu.a5_double_pointer.d12;

public class Q26 {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = new Q26().removeDuplicates(nums);
    }
}
