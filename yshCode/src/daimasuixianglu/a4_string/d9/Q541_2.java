package daimasuixianglu.a4_string.d9;


public class Q541_2 {

    public String reverseStr(String s, int k) {

        int len = s.length();
        char[] arr = s.toCharArray();
        for(int i = 0; i < len; i += 2 * k){
            reverseString(arr, i, Math.min(i + k, len)-1);
        }
        return new String(arr);

    }

    public void reverseString(char[] arr, int left, int right){
        while(left < right){
            arr[left] ^= arr[right];
            arr[right] ^= arr[left];
            arr[left] ^= arr[right];
            left++;
            right--;
        }
    }



}
