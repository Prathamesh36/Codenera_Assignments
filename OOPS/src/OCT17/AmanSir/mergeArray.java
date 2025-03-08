package OCT17.AmanSir;

import java.util.Scanner;

public class mergeArray {
    Scanner sc = new Scanner(System.in);
    public int[] merger(int a[],int b[]){
        int c[] = new int [a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }

        for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        return c;
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

        System.out.print("Enter your array size: ");
        int n1 = sc.nextInt();
        int[] b= new int[n1];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n1;i++){
            b[i]=sc.nextInt();
        }
        mergeArray ob = new mergeArray();
        int g[] =ob.merger(a,b);
        for (int el:g) {
            System.out.print(el+" ");
        }
    }
}
