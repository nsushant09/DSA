package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    /*
    * minAns = max value in array
    * maxAns = sum of all value in array
    * */

    static public int splitArray(int [] nums, int m){
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        //binary search
        while(start < end){
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with max sum;
            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > mid){
                    //you cannot add to subarray, make new one
                    //say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }

        }

        return end; //here start == end
    }

}
