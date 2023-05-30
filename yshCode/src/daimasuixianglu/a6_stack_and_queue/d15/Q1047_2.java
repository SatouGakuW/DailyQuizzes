package daimasuixianglu.a6_stack_and_queue.d15;


import java.util.Deque;
import java.util.LinkedList;

public class Q1047_2 {

    public String removeDuplicates(String s) {
       Deque<Character> stack = new LinkedList<>();
       StringBuilder res = new StringBuilder();
       for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           if(stack.size() > 0 && ch == stack.peek()){
               stack.pop();

           }else{
               stack.push(ch);

           }
       }
      while(!stack.isEmpty()){
           res.insert(0,stack.pop());
       }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        String res = new Q1047_2().removeDuplicates(s);
        System.out.println(res);
    }

}
