package a5_double_pointer;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  hello world  ";
        Q151 q151 = new Q151();
        System.out.println(q151.solution1(s));
    }
}

// 额外要求：空间复杂度O(1) 不使用库函数split
class Q151 {
    public String solution1(String s) {
        char[] c = s.toCharArray();
        // 使用双指针法移除空格
        int fast = 0, slow = 0;
        while (fast < c.length) {
            if (c[fast] != ' ') {
                if (slow != 0) {
                    c[slow++] = ' ';
                }
                while (fast < c.length && c[fast] != ' ') {
                    c[slow++] = c[fast++];
                }
            }
            else {
                fast++;
            }
        }
        char[] newc = new char[slow];
        // 拷贝字符串
        System.arraycopy(c, 0, newc, 0, slow);
        reverse(newc, 0, newc.length - 1);
        int start = 0;
        for (int i = 0; i < newc.length; i++) {
            if (newc[i] == ' ') {
                reverse(newc, start, i - 1);
                start = i + 1;
            }
        }
        reverse(newc, start, newc.length - 1);
        return new String(newc);
    }

    public void reverse(char[] c, int left, int right) {
        while (left < right) {
            char temp = c[left];
            c[left++] = c[right];
            c[right--] = temp;
        }
    }
}