package OCT17.AmanSir;

import java.util.Scanner;

public class maxElement {

    public int max(int[] a){
        int max =0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        maxElement ob = new maxElement();
        System.out.print("Max element of array is: "+ob.max(a));
    }
}
