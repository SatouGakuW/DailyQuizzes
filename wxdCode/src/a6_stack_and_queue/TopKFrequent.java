package a6_stack_and_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = q347s3(nums, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    // 大顶堆实现
    public static int[] q347s2(int[] nums, int k) {
        // 首先遍历nums，统计元素出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 在优先队列中存储二元组 (num, count) 元素与出现次数，可以基于大顶堆或者小顶堆实现排序
        // 括号里重写了比较器，利用lambda表达式
        // 这个lambda表达式的含义为接受2个int[]型参数,并返回第二个数的差值
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);
        // 遍历map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // 大顶堆需要对所有元素排序
            pq.add(new int[] {entry.getKey(), entry.getValue()});
        }

        int[] ans = new int[k];
        // 依次从队头弹出k个
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[0];
        }
        return ans;
    }

    // 小顶堆实现
    public static int[] q347s3(int[] nums, int k) {
        // 首先遍历nums，统计元素出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 在优先队列中存储二元组 (num, count) 元素与出现次数，可以基于大顶堆或者小顶堆实现排序
        // 括号里重写了比较器，利用lambda表达式
        // 这个lambda表达式的含义为接受2个int[]型参数,并返回第二个数的差值
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair1[1] - pair2[1]);
        // 遍历map，小顶堆只需要维持k个元素有序就行
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // 堆中元素个数少于k时直接加进去
            if (pq.size() < k)
                pq.add(new int[] {entry.getKey(), entry.getValue()});
            else {
                // 当前元素出现次数大于小顶堆的根结点(这k个元素中出现次数最少的那个)
                if (entry.getValue() > pq.peek()[1]) {
                    // 弹出队头，添加当前元素
                    pq.poll();
                    pq.add(new int[] {entry.getKey(), entry.getValue()});
                }
            }
        }

        int[] ans = new int[k];
        // 先弹出的是较小的，因此要从后往前填充ans
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = pq.poll()[0];
        }
        return ans;
    }

}
