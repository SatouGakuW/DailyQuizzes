package daimasuixianglu.a5_double_pointer.d12;

public class Q27 {

    public int removeElement(int[] nums, int val) {
         int slow = 0;
         for(int fast = 0; fast < nums.length; fast++){
             if(nums[fast] != val){
                 nums[slow] = nums[fast];
                 slow++;
             }
         }
         return slow;
    }

}
