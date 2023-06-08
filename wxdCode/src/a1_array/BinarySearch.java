package a1_array;

// Leetcode Q704
// 输出target对应的数组下标
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 5;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }

    // code here
    public static int binarySearch(int[] num, int target) {
        int left = 0, right = num.length;
        while (left < right) {
//            int mid = (left + right) / 2;
            int mid = left + ((right - left) >> 1); // 这种写法不容易溢出
            if (num[mid] > target) {
                right = mid;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
