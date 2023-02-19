package Sorting;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        return Arrays.equals(chars, chart);
    }


}
