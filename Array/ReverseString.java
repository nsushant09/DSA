package Array;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Sushant";
        reverseString(s.toCharArray());
    }
    static public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
