package daimasuixianglu.a6_stack_and_queue.d17;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q347 {

    Comparator<Pair<Integer,Integer>> comparator = new Comparator<Pair<Integer, Integer>>() {
        @Override
        public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
            return o2.getValue()-o1.getValue();// 降序排列
        }
    };

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> records = new HashMap<>();
        int[] res = new int[k];
        for(int num : nums){
            records.put(num,records.getOrDefault(num,0) + 1);
        }
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>(comparator);
        for(Map.Entry<Integer,Integer> entry : records.entrySet()){
            pq.add(new Pair<>(entry.getKey(), entry.getValue()));
        }
        for(int i = 0; i < k; i++){
            res[i] = pq.poll().getKey();
        }
        return res;
    }

}
