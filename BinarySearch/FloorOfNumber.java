package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 13;
        System.out.println("The floor is : " + getFloor(arr, target));
    }

    public static int getFloor(int [] arr, int target){
        if(arr.length == 0)
            return -1;

        int first = 0;
        int last = arr.length -1;

        while(first <= last){
            int mid = first + (last - first) / 2;

            if(arr[mid] == target)
                return arr[mid];
            else if(arr[mid] > target)
                last = mid - 1;
            else
                first = mid + 1;
        }

        return arr[last];
    }
}
