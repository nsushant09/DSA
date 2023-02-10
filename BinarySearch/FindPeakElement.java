package BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {

    }

    public int findPeakElement(int[] nums) {
        if (nums.length <= 1)
            return 0;

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }

            if (start == end) {
                return end;
            }
        }
        return -1;
    }
}
