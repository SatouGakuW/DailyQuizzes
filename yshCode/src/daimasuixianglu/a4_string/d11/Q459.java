package daimasuixianglu.a4_string.d11;

public class Q459 {

    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1,str.length()-1).contains(s);
    }

}
