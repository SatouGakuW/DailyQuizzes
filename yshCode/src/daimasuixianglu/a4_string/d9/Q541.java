package daimasuixianglu.a4_string.d9;


public class Q541 {

    public String reverseStr(String s, int k) {
        if(s.length() < k)
            return reverseString(s);
        StringBuilder res = new StringBuilder();
        int times = s.length() / (k * 2);
        int remainder = s.length() - times * k * 2;
        for(int i = 0; i < times; i++){
            int reverseLeft = 2 * k * i, reverseRight = (2 * i + 1) * k;
            int noReverseLeft = (2 * i + 1) * k, noReverseRight = 2 * (i + 1) * k;
            res.append(reverseString(s.substring(reverseLeft,reverseRight)));
            res.append(s.substring(noReverseLeft,noReverseRight));
        }
        if(remainder <= k)
            res.append(reverseString(s.substring(times * 2 * k)));
        else{
            res.append(reverseString(s.substring(times * 2 * k,s.length() - remainder + k)));
            res.append(s.substring(s.length()-remainder + k));
        }
        return res.toString();

    }

    public String reverseString(String s){
        StringBuilder res = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--)
            res.append(s.charAt(i));
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        String res = new Q541().reverseString(s);
        System.out.println(res);
    }

}
