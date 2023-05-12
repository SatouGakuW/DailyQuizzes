package daimasuixianglu.array.d1;

public class Q709 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int len = nums.length;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
