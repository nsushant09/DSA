package Sorting;

import java.util.Arrays;

//find max element in given array
//push it to the end
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static public int getMaxElementIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    static public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = getMaxElementIndex(arr, 0, arr.length - i);
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }
}
