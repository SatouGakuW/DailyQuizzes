package daimasuixianglu.a4_string.d9;

public class Offer05 {
    public String replaceSpace(String s) {
        if(s == null || s.length() == 0)
            return s;
        String reg = "\\s";
        String res = s.replaceAll(reg,"%20");
        return res;
    }

    public static void main(String[] args) {
        String s = "hello   world  !";
        String res = new Offer05().replaceSpace(s);
        System.out.println(res);
    }
}
