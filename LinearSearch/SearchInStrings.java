package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String string = "Sushant Neupane";
        char target = 'f';
        if(search(string, target))
            System.out.println("The string : " + string + " contains the character " + target );
        else
            System.out.println("The string : " + string + " does not contain the character " + target );
    }

    static boolean search(String string, char target){
        if(string.length() == 0)
            return false;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == target){
                return true;
            }
        }

        //another approach
        for(char ch : string.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
