package a6_stack_and_queue;

import java.util.Deque;
import java.util.LinkedList;

// 单调队列：队首 -> 队尾 递减 用双端队列实现
// 怎么push：如果新的元素大于队尾元素，就把队尾元素连续pop到大于新元素为止，然后再把新元素push进去
// 怎么pop：如果队首元素 = 滑动窗口中最前面的元素，说明这个窗口的最大值要离开滑动窗口了，需要将它pop出队列
// 整体逻辑：前k个元素直接调用push，进入队列，随后开始滑动窗口，pop一个，push一个
public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        int[] result = q239s2(nums, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] q239s2(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        int len = nums.length - k + 1;
        //存放结果元素的数组
        int[] res = new int[len];
        int num = 0;
        //自定义队列
        MyQueue myQueue = new MyQueue();
        //先将前k的元素放入队列
        for (int i = 0; i < k; i++) {
            myQueue.add(nums[i]);
        }
        res[num++] = myQueue.peek();
        for (int i = k; i < nums.length; i++) {
            //滑动窗口移除最前面的元素，移除是判断该元素是否放入队列
            myQueue.poll(nums[i - k]);
            //滑动窗口加入最后面的元素
            myQueue.add(nums[i]);
            //记录对应的最大值
            res[num++] = myQueue.peek();
        }
        return res;
    }
}

class MyQueue {
    Deque<Integer> deque = new LinkedList<>();
    //弹出元素时，比较当前要弹出的数值是否等于队列出口的数值，如果相等则弹出
    //同时判断队列当前是否为空
    void poll(int val) {
        if (!deque.isEmpty() && val == deque.peek()) {
            deque.poll();
        }
    }
    //添加元素时，如果要添加的元素大于入口处的元素，就将入口元素弹出
    //保证队列元素单调递减
    //比如此时队列元素3,1，2将要入队，比1大，所以1弹出，此时队列：3,2
    void add(int val) {
        while (!deque.isEmpty() && val > deque.getLast()) {
            deque.removeLast();
        }
        deque.add(val);
    }
    //队列队顶元素始终为最大值
    int peek() {
        return deque.peek();
    }
}
