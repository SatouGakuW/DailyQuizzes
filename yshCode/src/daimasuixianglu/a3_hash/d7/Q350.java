package daimasuixianglu.a3_hash.d7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> record1 = new HashMap<>();
        Map<Integer, Integer> record2 = new HashMap<>();
        List<Integer> res = new LinkedList<>();
        for (int num : nums1) {
            record1.put(num, record1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            record2.put(num, record2.getOrDefault(num, 0) + 1);
        }
        for (int key : record1.keySet()) {
            int minCount = 0;
            if (record2.get(key) != null)
                minCount = Math.min(record1.get(key), record2.get(key));
            for (int i = 0; i < minCount; i++)
                res.add(key);
        }
        int[] ans = new int[res.size()];
        int index = 0;
        for (Integer num : res)
            ans[index++] = num;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = new Q350().intersect(nums1,nums2);
    }

}
