package BinarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'z'));
    }

    static public char nextGreatestLetter(char[] letters, char target) {

        int first = 0;
        int last = letters.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (target < letters[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return letters[first % letters.length];
    }
}
