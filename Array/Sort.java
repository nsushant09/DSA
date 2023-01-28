package Array;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {0, 10, 40, 0, 20, 30, 50, 0, 80, 60, 70, 100, 0, 90, 0};
        System.out.println(Arrays.toString(sortArray(arr)));
        System.out.println(Arrays.toString(moveZeroEnd(arr)));

    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] moveZeroEnd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
