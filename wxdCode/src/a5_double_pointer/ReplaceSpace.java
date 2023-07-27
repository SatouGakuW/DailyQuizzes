package a5_double_pointer;

public class ReplaceSpace {
    public static void main(String[] args) {
        String s = "  ";
        Offer05 offer05 = new Offer05();
        System.out.println(offer05.solution1(s));
    }
}

class Offer05 {
    public String solution1(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        // 扩充字符串长度
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("  ");
            }
        }
        int left = s.length() - 1;
        s += sb.toString();
        int right = s.length() - 1;
        char[] c = s.toCharArray();
        while (left >= 0) {
            if (c[left] != ' ') {
                c[right--] = c[left--];
            }
            else {
                c[right--] = '0';
                c[right--] = '2';
                c[right--] = '%';
                left--;
            }
        }
        return new String(c);
    }
}