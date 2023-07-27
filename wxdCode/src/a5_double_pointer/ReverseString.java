package a5_double_pointer;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        Q344 q344 = new Q344();
        q344.solution1(s);
        for (char i : s) {
            System.out.print(i + " ");
        }
    }
}

class Q344 {
    public void solution1(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}