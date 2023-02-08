package Array;

import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};

        int [] [] finalArr = makeZeroMatric(arr);
        for (int[] ints : finalArr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    static int[][] makeZeroMatric(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < arr.length; k++) {
                        arr[i][k] = 0;
                        arr[k][j] = 0;
                    }
                }
            }
        }
        return arr;
    }
}
