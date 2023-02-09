package Array;

import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
public class CheckPermutation {

    public static void main(String[] args) {
        String str = "abc";
        String permutationTestString = "cba";
        permutation(str, "");
        System.out.println(isPermutation(str, permutationTestString));

    }

    static void permutation(String str, String prefix){
        if(str.length() == 0){
            System.out.println(prefix);
        }else{
            for(int i = 0; i < str.length() ; i++){
                String rem =  str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    static boolean isPermutation(String first, String second){
        if(first.length() != second.length())
            return false;

        char [] firstArray = first.toCharArray();
        char [] secondArray = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.toString(firstArray).equals(Arrays.toString(secondArray));
    }




}
