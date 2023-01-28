package Array;

public class LargestThree {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > first) {
                third = second;
                second = first;
                first = j;
            } else if (j > second) {
                third = second;
                second = j;
            } else if (j > third) {
                third = j;
            }
        }

        System.out.println("First : " + first);
        System.out.println("Second : " + second);
        System.out.println("Third : " + third);
    }

}
