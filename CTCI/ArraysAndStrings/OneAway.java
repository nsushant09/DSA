package CTCI.ArraysAndStrings;

/**
 * There are three types of edits that can be performed on strings :
 * insert a character
 * remove a character
 * replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 */
public class OneAway {
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "bale";
        System.out.println(isOneAway(str1, str2));
    }

    static boolean isOneAway(String str1, String str2){
        if(str1.length() == str2.length()){
            return isOneAwayE(str1, str2);
        }else if(str1.length() < str2.length()){
            return isOneAwayNE(str2, str1);
        }else{
            return isOneAwayNE(str1, str2);
        }
    }

    static boolean isOneAwayE(String str1, String str2){
        boolean foundDifference = false;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    static boolean isOneAwayNE(String str1, String str2){
        int index1 = 0;
        int index2 = 0;

        while(index2 < str2.length() && index1 < str1.length()) {

            if (str1.charAt(index1) == str2.charAt(index2)) {
                index1++;
                index2++;
            } else {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            }
        }
        return true;
    }
}
