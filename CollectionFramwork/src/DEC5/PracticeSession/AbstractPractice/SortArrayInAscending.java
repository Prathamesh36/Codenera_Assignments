package DEC5.PracticeSession.AbstractPractice;

import java.util.Scanner;
abstract class Solve6{
    abstract int[] sortInAsc(int[] a);

}

public class SortArrayInAscending extends Solve6{
    int[] sortInAsc(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
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
        SortArrayInAscending ob = new SortArrayInAscending();
        int[] g = ob.sortInAsc(a);
        System.out.print("Ascending order Array: ");
        for (int i = 0; i <g.length; i++) {
            if(g[i]!=0){
                System.out.print(g[i]+" ");
            }
        }

    }
}