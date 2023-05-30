package daimasuixianglu.a6_stack_and_queue.d15;

import java.util.LinkedList;
import java.util.Queue;

public class Q225 {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int change = 0;

    public Q225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        while(!queue1.isEmpty()){
             queue2.offer(queue1.poll());
        }
        Queue<Integer> queueTemp = queue1;
        queue1 = queue2;
        queue2 = queueTemp;
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

}
