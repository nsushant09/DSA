package LinearSearch;

public class CountEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(getEvenCount(nums));
    }

    public static int digitsCountLog(int number){
        if(number < 0){
            number *= -1;
        }
        return (int) (Math.log10(number)) + 1;
    }
    public static int getEvenCount(int[] array){
        int count = 0;
        for(int numbers : array){
            if(getDigitsCount(numbers) % 2 == 0)
                count++;
        }
        return count;
    }

    public static int getDigitsCount(int number){
        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
        }
        return  count;
    }

}
