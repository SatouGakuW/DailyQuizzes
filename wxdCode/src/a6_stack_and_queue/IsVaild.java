package a6_stack_and_queue;

import java.util.Stack;

public class IsVaild {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(q20s1(s));
    }

    public static boolean q20s1(String s) {
        // 注意false有三种情况
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty())
                    return false;
                if (s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else if (s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                } else if (s.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty())
            return true;
        return false;
    }
}
