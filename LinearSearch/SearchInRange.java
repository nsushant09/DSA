package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {18, 12, -7, 3, 14, 28};
        System.out.println("The index of element searched is " + getElementIndex(array, -7, 1, 8));
    }

    public static int getElementIndex(int[] array, int target, int startIndex, int endIndex) {

        try {
            for (int i = startIndex; i <= endIndex; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }

        return -1;
    }
}
