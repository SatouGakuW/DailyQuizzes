package daimasuixianglu.a6_stack_and_queue.d15;


public class Q1047 {

    public String removeDuplicates(String s) {
       StringBuilder stack = new StringBuilder();
       int top = -1;
       for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           if(top >= 0 && ch == stack.charAt(top)){
               stack.deleteCharAt(top);
               top--;
           }else{
               stack.append(ch);
               top++;
           }
       }
        return stack.toString();
    }

    public static void main(String[] args) {
        String s = "aaaaaaa";
        String res = new Q1047().removeDuplicates(s);
        System.out.println(res);
    }

}
