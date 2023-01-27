package LoopPatterns;

public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=1; j--){
                if(j <= i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
