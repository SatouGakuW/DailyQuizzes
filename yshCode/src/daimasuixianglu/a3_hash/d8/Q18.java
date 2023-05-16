package daimasuixianglu.a3_hash.d8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 4)
            return null;
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1])continue;
            if((long) nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target)
                return res;
            if((long) nums[i] + nums[len - 3] + nums[len-2] + nums[len-1] < target)
                continue;
            for(int j = i + 1; j < len -2; j++){
                if(j > i + 1 && nums[j] == nums[j-1])
                    continue;
                if((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
                    break;
                if((long) nums[i] + nums[j] + nums[len-2] + nums[len-1] < target)
                    continue;
                int left = j + 1, right = len-1;
                while(left < right){
                    int temp = nums[i] + nums[j] + nums[left] + nums[right];
                    if(temp < target)
                        left ++;
                    else if(temp > target)
                        right --;
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        while(left < right && nums[left] == nums[left + 1]) left++;
                        left ++;
                        while(left < right && nums[right] == nums[right - 1]) right --;
                        right --;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
        int target = -1;
        List<List<Integer>> res = new Q18().fourSum(nums,target);
        for(List<Integer> list : res)
            System.out.println(list);

    }
}
