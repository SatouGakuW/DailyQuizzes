package daimasuixianglu.a4_string.d10;

public class Offer58II {

    public String reverseLeftWords(String s, int n) {
        String addLast = s.substring(0, n);
        String res = s.substring(n) + addLast;
        return res;
    }

}
