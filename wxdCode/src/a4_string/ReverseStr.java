package a4_string;

public class ReverseStr {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        System.out.println(q541s1(s, k));
    }

    public static String q541s1(String s, int k) {
        char[] sCharArr = s.toCharArray();
        int rounds = sCharArr.length / (2 * k);
        for (int i = 0; i < rounds; i++) {
            reverse(sCharArr, i * 2 * k, i * 2 * k + k - 1);
        }
        int remainLength = sCharArr.length % (2 * k);
        if (remainLength < k) {
            reverse(sCharArr, rounds * 2 * k, sCharArr.length - 1);
        } else {
            reverse(sCharArr, rounds * 2 * k, rounds * 2 * k + k - 1);
        }
        s = new String(sCharArr);
        return s;
    }

    public static void reverse(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
