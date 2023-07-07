package a6_stack_and_queue;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvalRPN {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(q150s1(tokens));
    }

    public static int q150s1(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            // 碰到数字直接入栈；碰到符号弹出栈顶的两个数做运算，然后将得到的结果压栈。
            // 先出栈的是运算符右侧的数
            if (tokens[i].equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (tokens[i].equals("-")) {
                st.push(-st.pop() + st.pop());
            } else if (tokens[i].equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (tokens[i].equals("/")) {
                int right = st.pop(), left = st.pop();
                st.push(left / right);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}
