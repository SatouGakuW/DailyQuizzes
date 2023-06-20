package a4_string;

// LeetCode Q344
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        solution(s);
        System.out.println(s);
    }

    public static void solution(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}
