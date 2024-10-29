package DEC5.PracticeSession.AbstractPractice;

import java.util.Scanner;
abstract class Solve7{
    abstract int[] sortInDesc(int[] a);

}

public class SortArrayInDescending extends Solve7{
    int[] sortInDesc(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array 1 element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        SortArrayInDescending ob = new SortArrayInDescending();
        int[] g = ob.sortInDesc(a);
        System.out.print("Descending order Array: ");
        for (int i = 0; i <g.length; i++) {
            if(g[i]!=0){
                System.out.print(g[i]+" ");
            }
        }

    }
}