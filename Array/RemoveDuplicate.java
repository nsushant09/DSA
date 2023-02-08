package Array;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,5,6,8,9,9};
        int[] test = {1,1,2};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] nums) {
        int duplicateCount = 0;

        // exchange duplicates
        for(int i = 0; i < nums.length - duplicateCount - 1; i++){
            if(nums[i] == nums[i + 1]){
                int temp = nums[nums.length - duplicateCount - 1];
                nums[nums.length - duplicateCount - 1] = nums[i];
                nums[i] = temp;
                duplicateCount++;
            }
        }

        return sortArray(nums, 0, nums.length - duplicateCount);
    }

    private static int[] sortArray(int[] arr,int start, int end){

        if(start < 0 || start > arr.length){
            start = 0;
        }
        if(end < 0 || end > arr.length){
            end = arr.length;
        }

        for(int i = start; i < end - 1; i++){
            for(int j = i + 1; j < end; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
