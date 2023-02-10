package Array;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1};
        System.out.println(maxSubArray(arr));
    }

    static public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = getSum(nums, i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    static public int getSum(int[] nums, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
