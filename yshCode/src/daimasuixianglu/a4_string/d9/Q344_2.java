package daimasuixianglu.a4_string.d9;

public class Q344_2 {

    public void reverseString(char[] s) {
        int left  = 0, right = s.length - 1;
        // 假设s[left] 为 a, s[right]  为b
        while(left < right){
            s[left] ^= s[right];  // s[left] = a ^ b
            s[right] ^= s[left];  // s[right] = b ^ a ^ b = a
            s[left] ^= s[right];  // s[left] = a ^ b ^ a = b
            left ++;
            right --;
        }
    }

}
