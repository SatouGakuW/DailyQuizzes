package daimasuixianglu.a5_double_pointer.d14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        if(nums.length < 3)
            return res;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){

            if(i > 0 && nums[i-1] == nums[i])
                continue;;

            int left = i + 1, right = nums.length-1;

            while(left < right){

                int target = nums[i] + nums[left] + nums[right];
                if(target > 0){
                    right--;
                }else if(target < 0){
                    left ++;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while(left < right && nums[left] == nums[left + 1])
                        left++;
                    left++;
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                }
            }
        }
        return res;
    }


}
