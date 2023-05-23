package daimasuixianglu.a5_double_pointer.d12;

public class Q344 {
    public void reverseString(char[] s) {
         int left = 0, right = s.length - 1;
         while(left < right){
             s[left] ^= s[right];
             s[right] ^= s[left];
             s[left] ^= s[right];
             left++;
             right--;
         }
    }
}
