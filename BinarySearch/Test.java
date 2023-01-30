package BinarySearch;

public class Test {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(array, 7, Order.ASCENDING));
        int [] array2 = {9,8,7,6,5,4,3,2,1};
        System.out.println(search(array2, 7, Order.DESCENDING));
    }

    enum Order{
        ASCENDING,
        DESCENDING
    }
    public static int search(int [] array, int target, Order order){
        int head = 0;
        int tail = array.length - 1;

        while(head <= tail){
            int mid = head + (tail - head) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                if(order == Order.ASCENDING)
                    tail = mid -1;
                else
                    head = mid + 1;
            }else{
                if(order == Order.ASCENDING)
                    head = mid + 1;
                else
                    tail = mid -1;
            }
        }

        return -1;
    }
}
