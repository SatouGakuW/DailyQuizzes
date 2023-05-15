package daimasuixianglu.a3_hash.d7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q438 {

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        if(sLen < pLen)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for(int i = 0; i < pLen; i++){
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sCount,pCount))
            res.add(0);
        for(int i = 0; i < sLen - pLen; i++){
            sCount[s.charAt(i)-'a']--;
            sCount[s.charAt(i + pLen) - 'a']++;
            if(Arrays.equals(sCount,pCount))
                res.add(i + 1);
        }
        return res;
    }

}
