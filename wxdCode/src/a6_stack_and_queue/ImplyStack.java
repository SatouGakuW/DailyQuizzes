package a6_stack_and_queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ImplyStack {
    public static void main(String[] args) {
        MyStack1 obj = new MyStack1();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}

class MyStack1 {
    private Queue<Integer> queue;

    public MyStack1() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
        return queue.poll();
    }

    public int top() {
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
        int top = queue.peek();
        queue.add(queue.poll());
        return top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
