package daimasuixianglu.a5_double_pointer.d14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4)
            return res;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if ((long)nums[i] + nums[len - 3] + nums[len - 2] + nums[len - 1] < target)
                continue;
            if ((long)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
                return res;

            for (int j = i + 1; j < len - 2; j++) {
                int left = j + 1, right = len - 1;
                 if(j > i + 1 && nums[j] == nums[j-1])
                     continue;
                 if((long)nums[i] + nums[j] + nums[j+1] + nums[j+2] > target)
                     break;
                 if((long)nums[i] + nums[j] + nums[len - 2] + nums[len -1] < target)
                     continue;
                while (left < right) {

                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        left++;
                        while (left < right && nums[left] == nums[right])
                            right--;
                        right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,1000000000,1000000000,1000000000,1000000000};
        int target = 1000000000;
        List<List<Integer>> res = new Q18().fourSum(nums, target);

    }

}
