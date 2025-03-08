package NOV27;

import java.util.Arrays;
import java.util.Scanner;

public class Place0AtCenterOfArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int start=0;
        int count=0;
        for (int i = a.length-1; i>0 ; i--) {
            if(a[i]!=0){
                count++;
            }
        }
        for (int i = (a.length)-count; i < (a.length)-(count/2); i++) {
            int temp = a[start];
            a[start]=a[i];
            a[i]=temp;
            start++;
        }
        System.out.println("Array after centering zero's");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
/*
Enter your array size: 10
Enter your array element:
0 5 0 5 6 3 0 4 0 5

Array after centering zero's
3 4 5 0 0 0 0 5 5 6
*/