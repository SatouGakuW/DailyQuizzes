package daimasuixianglu.a3_hash.d8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15 {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(len < 3)
            return res;
        for(int i = 0; i < len - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i] > 0)
                return res;
            int left = i + 1, right = len - 1;
            while(left < right){
                int temp = nums[i] + nums[left] + nums[right];
                if(temp < 0)
                    left++;
                else if(temp > 0)
                    right--;
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while(left < right && nums[left]== nums[left+1]) left++;
                    left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    right--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        for(int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }

}
