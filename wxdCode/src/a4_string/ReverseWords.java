package a4_string;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "a good   example   ";
        System.out.println(q151s1(s));
    }

    public static String q151s1(String s) {
        s = removeSpace(s);
        char[] sChar = s.toCharArray();
        int left = 0, right = 0;
        int lastSpaceIdx = 0;
        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] == ' ') {
                reverse(sChar, lastSpaceIdx, i - 1);
                lastSpaceIdx = i + 1;
            }
        }
        reverse(sChar, lastSpaceIdx, sChar.length - 1);
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

    public static String removeSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int leftend = 0, rightend = s.length() - 1;

        // 去掉首尾空格
        while (s.charAt(leftend) == ' ')
            leftend++;
        while (s.charAt(rightend) == ' ')
            rightend--;

        // 去掉中间空格
        int left = leftend, right;
        while (left <= rightend) {
            if (s.charAt(left) != ' ') {
                right = left;
                while (right <= rightend && s.charAt(right) != ' ') {
                    sb.append(s.charAt(right++));
                }
                left = right;
                if (right <= rightend)
                    sb.append(' ');
            } else {
                left++;
            }
        }
        return sb.toString();
    }

}
