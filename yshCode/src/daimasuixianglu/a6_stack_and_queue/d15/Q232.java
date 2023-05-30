package daimasuixianglu.a6_stack_and_queue.d15;

import java.util.Deque;
import java.util.LinkedList;

public class Q232 {


    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public Q232() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(stack2.isEmpty()){
            stack1ToStack2();
        }
        return stack2.size() != 0 ? stack2.pop() : -1;
    }

    public int peek() {
        if(stack2.isEmpty()){
            stack1ToStack2();
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }

    public void stack1ToStack2(){
        if(stack2.isEmpty()){
            if(!stack1.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }
    }
}
