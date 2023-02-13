package BinarySearch;

public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(1));
    }

    static public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }

            if (start == end) {
                return end;
            }

        }

        return -1;
    }

    static public boolean isBadVersion(int version) {
        return version >= 4;
    }
}

