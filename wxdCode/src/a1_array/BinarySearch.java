package a1_array;

import java.util.Arrays;

// 输出target对应的数组下标
public class BinarySearch {
    public static void main(String[] args) {
        int target = 0;
        boolean ans = isPerfectSquare(target);
        System.out.println(ans);
    }

    // LeetCode Q704
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
//            int mid = (left + right) / 2;
            int mid = left + ((right - left) >> 1); // 这种写法不容易溢出
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // LeetCode Q35
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        int ans = -1;
        while (left < right) {
            int mid = left + ((right - left) >> 1); // 这种写法不容易溢出
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        if (ans == -1) {
            ans = right;
        }
        return ans;
    }

    // LeetCode Q34
    // 分别找左右边界！！！不要想着一次性找到！！！
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = getLeftBorder(nums, target);
        result[1] = getRightBorder(nums, target);
        return result;
    }
    public static int getLeftBorder(int[] nums, int target) {
        int left = 0, right = nums.length;
        int leftBorder = -1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] >= target) {
                right = mid;
                if (nums[mid] == target)
                    leftBorder = right;
            }
            else {
                left = mid + 1;
            }
        }
        return leftBorder;
    }
    public static int getRightBorder(int[] nums, int target) {
        int left = 0, right = nums.length;
        int rightBorder = 0;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target)
                    rightBorder = left;
            }
            else {
                right = mid;
            }
        }
        return rightBorder - 1;
    }

    // LeetCode Q69
    // 一定要加long！！否则大数会溢出！！
    public static int mySqrt(int x) {
        int left = 0, right = x;
        int ans = -1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if ((long)mid * mid <= x) {
                left = mid + 1;
                ans = mid;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }

    // LeetCode 367
    public static boolean isPerfectSquare(int num) {
        int left = 0, right = num + 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1); // 移位的优先级。。？
            if ((long)mid * mid > num) {    // long！！！
                right = mid;
            } else if ((long)mid * mid < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
