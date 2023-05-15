package daimasuixianglu.a3_hash.d7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2= new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num))
                set2.add(num);
        }
        int[] res = new int[set2.size()];
        Iterator<Integer> it = set2.iterator();
        for(int i = 0; i < res.length; i++){
            res[i] =it.next();;
        }
        return res;

    }

}
