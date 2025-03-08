package Jun26;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static int[] reverseArray(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            newArray[i]=arr[arr.length-1-i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] demo = reverseArray(arr);
        System.out.print("Reverse Array: "+ Arrays.toString(demo));
    }
}
