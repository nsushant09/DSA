package Array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    /**
     * Divide the array by half
     * First element to last
     * Last to first
     */
    public static int[] reverseArray(int [] array){
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length -i - 1] = temp;
        }
        return array;
    }
}
