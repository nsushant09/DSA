package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {

    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakElementIndex = getPeakElementIndex(mountainArr);
        int ascendingResult = binarySearch(mountainArr, target, 0, peakElementIndex, 0);
        return ascendingResult != -1 ? ascendingResult : binarySearch(mountainArr, target, peakElementIndex + 1, mountainArr.length() - 1, 1);

    }

    static int getPeakElementIndex(MountainArray mountainArray) {
        int start = 0;
        int end = mountainArray.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArray.get(mid) < mountainArray.get(mid + 1)) {
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

    /**
     * 0 for ascending
     * 1 for descending
     */
    static int binarySearch(MountainArray mountainArray, int target, int start, int end, int order) {

        if (mountainArray.length() == 0)
            return -1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mountainArray.get(mid) == target) {
                return mid;
            } else if (target < mountainArray.get(mid)) {
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

interface MountainArray {
    public int get(int index);

    public int length();
}