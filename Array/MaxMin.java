package Array;

public class MaxMin {
    public static void main(String[] args) {
        int[] array = {10, 70, 40, 90, 20, 38, 54, 90, 32};
        System.out.println(max(array));
        System.out.println(min(array));
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
