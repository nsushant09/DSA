package BinarySearch;

public class RotatedSearchArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        int target = 2;
        System.out.println(search(nums, target));
    }

    static public int search(int[] nums, int target) {
        int peakIndex = getPeakIndex(nums);
        if (peakIndex != -1 && nums[0] > nums[peakIndex]) {
            peakIndex = 0;
        }
        int firstResult = orderAgnosticSearch(nums, target, 0, peakIndex, 0);
        return firstResult != -1 ? firstResult : orderAgnosticSearch(nums, target, peakIndex + 1, nums.length - 1, 0);
    }

    static public int getPeakIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else if(nums[start] >= nums[mid]){
                end = mid;
            }else{
                start = mid + 1;
            }

            if (start == end) {
                return end;
            }
        }

        return -1;
    }

    /**
     * @param nums   array
     * @param target .
     * @param start  Inclusive
     * @param end    Inclusive
     * @param order  0 for ascending, 1 for descending
     * @return return the target element index, return -1 if not found
     */
    static public int orderAgnosticSearch(int[] nums, int target, int start, int end, int order) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                if (order == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (order == 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
