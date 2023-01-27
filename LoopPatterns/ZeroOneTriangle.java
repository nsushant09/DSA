package LoopPatterns;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<=i; j++){
                if(isEvenCell(i + j)){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isEvenCell(Integer number){
        return number % 2 == 0;
    }
}
