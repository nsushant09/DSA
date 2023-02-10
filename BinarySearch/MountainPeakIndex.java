package BinarySearch;

public class MountainPeakIndex {
    /**
     * Mountain array is an array where numbers increase then decrease
     */
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // in ascending part of array
                start = mid + 1;
            } else {
                // in descending part of array
                end = mid;
            }

            /*
              In the end, start == end and pointing to the largest number because of the 2 checks above
              start and end are always trying to find max element in the above 2 checks
              hence, when they are pointing to just one element, that is the max one because that is what the checks say
              more elaboration:
              at every point of time for start and end, they have the best possible answer till that time
              and if we are saying that only on eitem is remaining, hence because of above line that is the best possible answer
             */

            if (start == end) {
                return end;
            }
        }
        return -1;
    }
}
