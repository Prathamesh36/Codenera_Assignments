package Jun26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateArrayElement {
    public static int[] updateElement(int[] arr, int index,int newElmt){

        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                arr[i]=newElmt;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter new Element: ");
        int newElmt = sc.nextInt();
        System.out.print("Enter index number: ");
        int index = sc.nextInt();

        int[] demo = updateElement(arr,index,newElmt);
        System.out.print("Updated array:"+ Arrays.toString(demo));
    }
}
