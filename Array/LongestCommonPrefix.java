package Array;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"ab", "a"};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 0)
            return prefix;

        prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < prefix.length()) {
                prefix = prefix.substring(0, strs[i].length());
            }
            for (int j = Math.min(prefix.length(), strs[i].length()); j >= 0; j--) {
                if (!prefix.substring(0, j).equals(strs[i].substring(0, j))) {
                    prefix = prefix.substring(0, j - 1);
                }
            }
        }

        return prefix;
    }
}
