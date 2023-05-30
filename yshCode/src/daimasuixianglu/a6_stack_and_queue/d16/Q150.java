package daimasuixianglu.a6_stack_and_queue.d16;

import java.util.Deque;
import java.util.LinkedList;

public class Q150 {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if(isNumber(token)){
               stack.push(Integer.valueOf(token));
            }else{
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (token){
                    case "+" :
                        stack.push(num1 + num2);
                        break;
                    case "-" :
                        stack.push(num1 - num2);
                        break;
                    case "*" :
                        stack.push(num1 * num2);
                        break;
                    case "/" :
                        stack.push(num1 / num2);
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String token){
        return !(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    }


}
