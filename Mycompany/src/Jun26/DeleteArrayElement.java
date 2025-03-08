package Jun26;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElement {
    public static int[] deleteElement(int[] arr, int index){
        int[] newArray = new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            newArray[i]=arr[i];
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[i]=arr[i+1];
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
        System.out.print("Enter index number: ");
        int index = sc.nextInt();

        int[] demo = deleteElement(arr,index);
        System.out.print("New Array: "+ Arrays.toString(demo));
    }
}
