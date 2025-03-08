package JAN8;

import java.util.Arrays;
import java.util.Scanner;

public class PrintSeriesOfPalindrome {

    public static boolean isPali(int n){
        int res=0;
        int rem;
        for(int i=n;i!=0;i=i/10){
            rem = i%10;
            res = (res*10)+rem;
        }
        if(res==n) return true;
        return false;

    }
    public static void ans(int[] arr){
        System.out.print("OUTPUT: ");
        for (int i = arr[0]; i <=arr[1] ; i++) {
            if(isPali(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {


        int[] arr={11,50};


        System.out.println("Array: "+ Arrays.toString(arr));
        if(arr.length>2){
            System.out.print("Array can't take more the two elements.");
        }
        else if(arr.length==0){
            System.out.print("Array can't be empty");
        }
        else{

            ans(arr);
        }


    }
}
