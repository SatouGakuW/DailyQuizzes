package a6_stack_and_queue;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(q1047s1(s));
    }

    public static String q1047s1(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || st.peek() != s.charAt(i)) {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }
}
