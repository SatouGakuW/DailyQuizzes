package a4_string;

public class ReverseLeftWords {
    public static void main(String[] args) {
        String s = "lrloseumgh";
        int k = 6;
        System.out.println(offer58s2(s, k));
    }

    public static String offer58s1(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // 不申请额外空间，只在本串上操作
    public static String offer58s2(String s, int n) {
        char[] sChar = s.toCharArray();
        reverse(sChar, 0, n - 1);
        reverse(sChar, n, sChar.length - 1);
        reverse(sChar, 0, sChar.length - 1);
        return new String(sChar);
    }

    public static void reverse(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
