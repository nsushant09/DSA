package BinarySearch;

import java.util.Arrays;

// Run Binary Search Twice for first and last each time.
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);
        return result;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        if (nums.length == 0)
            return ans;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
