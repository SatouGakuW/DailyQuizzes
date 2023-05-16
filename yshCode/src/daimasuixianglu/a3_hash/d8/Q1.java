package daimasuixianglu.a3_hash.d8;

import java.util.HashMap;
import java.util.Map;

public class Q1 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> record = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(record.containsKey(target-nums[i]))
                return new int[]{record.get(target-nums[i]),i};
            record.put(nums[i],i);
        }
        return null;
    }

}
