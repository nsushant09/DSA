package LoopPatterns;

public class SolidRectangle {
    public static void main(String[] args) {

        int rowValue = 4;

        for(int row = 0; row < rowValue ; row ++){
            for(int col = 0; col < rowValue + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
