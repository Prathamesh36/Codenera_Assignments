package JAN31.Advance;

import java.util.Arrays;

public class NegativeLeftAndPositiveToRightSide {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,0,0,-6};
        System.out.println("arr[] ="+ Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Output: "+Arrays.toString(arr));


    }
}
