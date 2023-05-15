package daimasuixianglu.a3_hash.d7;

import java.util.HashMap;
import java.util.Map;

public class Q242 {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> record = new HashMap<>();

        for(Character c : s.toCharArray()){
            record.put(c,record.getOrDefault(c,0) + 1);
        }

        for(Character c : t.toCharArray()){
            if(record.containsKey(c)){
                record.put(c,record.get(c) - 1);
                if(record.get(c) == 0)
                    record.remove(c);
            }else{
                return false;
            }
        }
        return record.size() == 0 ? true : false;
    }
}
