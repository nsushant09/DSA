package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 4, 3, 2},
                {9, 8, 10, 6, 7},
                {20, 40, 30, 50, 10}
        };

        System.out.println(Arrays.toString(search(array, 99)));
    }

    public static int[] search(int[][] array, int target) {
        // 0 represent rowIndex
        // 1 represents columnIndex
        int[] resultIndexes = {-1, -1};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    resultIndexes[0] = i;
                    resultIndexes[1] = j;
                }
            }
        }

        return resultIndexes;
    }
}
