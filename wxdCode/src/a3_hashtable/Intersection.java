package a3_hashtable;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        int[] result = q350(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] q349(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = new HashSet<>(), resultSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            setNums1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (setNums1.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }
        int[] result = new int[resultSet.size()];
        int idx = 0;
        for (int e : resultSet) {
            result[idx++] = e;
        }
        return result;
    }

    public static int[] q350(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mapNums1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = mapNums1.containsKey(nums1[i]);
            if (flag) {
                int value = mapNums1.get(nums1[i]);
                value++;
                mapNums1.put(nums1[i], value);
            }
            else {
                mapNums1.put(nums1[i], 1);
            }
        }
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (mapNums1.containsKey(nums2[i])) {
                int value = mapNums1.get(nums2[i]);
                if (value > 0) {
                    resultList.add(nums2[i]);
                    value--;
                    mapNums1.put(nums2[i], value);
                }
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
