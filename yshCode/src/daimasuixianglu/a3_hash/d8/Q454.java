package daimasuixianglu.a3_hash.d8;

import java.util.HashMap;
import java.util.Map;

public class Q454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> record1 = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                int sum = nums1[i] + nums2[j];
                record1.put(sum,record1.getOrDefault(sum,0) +1);
            }
        }
        for(int i = 0; i < nums3.length; i++){
            for(int j = 0; j < nums4.length; j++){
                int sum = -(nums3[i] + nums4[j]);
                if(record1.containsKey(sum))
                    count += record1.get(sum);
            }
        }
        return count;
    }

}
