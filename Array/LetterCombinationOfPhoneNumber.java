package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Incomplete
 */
public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {

    }

    static public List<String> letterCombinations(String digits) {
        HashMap<Character, char []> map = new HashMap<>();
        map.put('1', new char[] {});
        map.put('2', new char[] {'a', 'b', 'c'});
        map.put('3', new char[] {'d', 'e', 'f'});
        map.put('4', new char[] {'g', 'h', 'i'});
        map.put('5', new char[] {'j', 'k', 'l'});
        map.put('6', new char[] {'m', 'n', 'o'});
        map.put('7', new char[] {'p', 'q', 'r', 's'});
        map.put('8', new char[] {'t', 'u', 'v'});
        map.put('9', new char[] {'w', 'x', 'y', 'z'});
        map.put('0', new char[] {' '});

        char [] digitArray = digits.toCharArray();
        List<String> finalList = new ArrayList<>();
        for(int i = 0; i < digitArray.length; i++){

        }

        return finalList;
    }
}
