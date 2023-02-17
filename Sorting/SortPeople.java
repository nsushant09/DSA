package Sorting;

import java.util.Arrays;

//Uses bubble sort
public class SortPeople {
    public static void main(String[] args) {
        int[] heights = {155, 185, 150};
        String[] names = {"Alice", "Bob", "Bob"};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    static public String[] sortPeople(String[] names, int[] heights) {

        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {

                if (heights[i] < heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }

            }
        }

        return names;
    }
}
