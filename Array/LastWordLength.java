package Array;

public class LastWordLength {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    static public int lengthOfLastWord(String s) {
        String [] array = s.split(" ");
        if(array.length == 0)
            return 0;

        return array[array.length - 1].length();
    }
}
