package BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        int target = 37;
        System.out.println(Arrays.toString(search(arr, target)));

        int[][] sortedMatrix = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12}, {12,13}, {14, 15}};
        System.out.println(Arrays.toString(searchInSortedMatrix(sortedMatrix, 12)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }

            if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }

        }

        return new int[]{-1, -1};
    }

    static int[] searchInSortedMatrix(int[][] matrix, int target) {

        int start = 0;
        int end = matrix.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int matrixMidLength = matrix[mid].length - 1;

            if (matrix[mid][0] <= target && matrix[mid][matrixMidLength] >= target) {
                int result = binarySearch(matrix[mid], target);
                if (result != -1) {
                    return new int[]{mid, result};
                }
                return new int[]{-1, -1};
            } else if (target < matrix[mid][0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}