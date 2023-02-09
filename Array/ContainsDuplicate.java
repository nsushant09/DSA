package Array;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    static public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}
