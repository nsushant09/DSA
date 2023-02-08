package Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 9){
                arr[i] = 0;
                if(i == 0){
                    arr = newArray(arr);
                }
            }else{
                arr[i]++;
                break;
            }
        }
        return arr;
    }

    public static int[] newArray(int [] oldArray){
        int [] newArray = new int[oldArray.length + 1];
        newArray[0] = 1;
        System.arraycopy(oldArray, 0, newArray, 1, oldArray.length);
        return newArray;
    }

}
