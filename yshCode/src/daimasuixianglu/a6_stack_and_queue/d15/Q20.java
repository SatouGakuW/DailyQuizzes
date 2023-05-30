package daimasuixianglu.a6_stack_and_queue.d15;

import java.util.Deque;
import java.util.LinkedList;

public class Q20 {

    public boolean isValid(String s) {
        if (s == null || s.length() == 1)
            return false;
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                if (stack.peek() == '(' && c == ')')
                    stack.pop();
                else if (stack.peek() == '[' && c == ']')
                    stack.pop();
                else if (stack.peek() == '{' && c == '}')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();

    }

}
