package CTCI.ArraysAndStrings;

/**
 * Implement an alogirthm to determine if a string has all unique characters. What if you cannot use additional data structures?
 * Here case is ignored
 */
public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("Sushant"));
    }

    public static boolean isUnique(String str){
        if(str.length() > 128)
            return false;
        else{
            boolean[] char_set = new boolean[128];
            for(int i = 0; i < str.length(); i++){
                int val = str.charAt(i);

                //for non case sensitive
                if(val >= 97 && val <= 122){
                    val -= 32;
                }

                if(char_set[val]){
                    return false;
                }
                char_set[val] = true;
            }
            return true;
        }
    }

}
