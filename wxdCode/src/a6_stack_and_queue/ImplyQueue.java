package a6_stack_and_queue;

import java.util.Stack;

public class ImplyQueue {
    public static void main(String[] args) {
        MyQueue2 obj = new MyQueue2();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}

class MyQueue1 {
    private Stack<Integer> st;
    public MyQueue1() {
        st = new Stack<Integer>();
    }

    public void push(int x) {
        Stack<Integer> helpst = new Stack<>();
        if (st.isEmpty()) {
            st.push(x);
            return;
        } else {
            while (!st.isEmpty()) {
                int tmp = st.pop();
                helpst.push(tmp);
            }
            st.push(x);
            while (!helpst.empty()) {
                int tmp = helpst.pop();
                st.push(tmp);
            }
        }
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        return st.isEmpty();
    }

}

class MyQueue2 {
    private Stack<Integer> stIn, stOut;

    public MyQueue2() {
        stIn = new Stack<>();
        stOut = new Stack<>();
    }

    public void push(int x) {
        stIn.push(x);
    }

    public int pop() {
        if (stOut.isEmpty()) {
            while (!stIn.isEmpty()) {
                stOut.push(stIn.pop());
            }
        }
        return stOut.pop();
    }

    public int peek() {
        if (stOut.isEmpty()) {
            while (!stIn.isEmpty()) {
                stOut.push(stIn.pop());
            }
        }
        return stOut.peek();
    }

    public boolean empty() {
        return stIn.isEmpty() && stOut.isEmpty();
    }
}
