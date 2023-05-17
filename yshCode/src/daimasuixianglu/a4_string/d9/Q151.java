package daimasuixianglu.a4_string.d9;

public class Q151 {

    public String reverseWords(String s) {
        String reg = "\\s+";
        String[] arr = s.trim().split(reg);
        StringBuilder res = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            res.append(arr[i]);
            res.append(" ");
        }
        return res.toString().trim();

    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String res = new Q151().reverseWords(s);
        System.out.println(res);
    }

}
