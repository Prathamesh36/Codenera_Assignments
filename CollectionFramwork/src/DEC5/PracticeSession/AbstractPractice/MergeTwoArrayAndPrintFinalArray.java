package DEC5.PracticeSession.AbstractPractice;
import java.util.Scanner;
abstract class Solve5{
    abstract int[] merge(int[] a,int[] b);

}

public class MergeTwoArrayAndPrintFinalArray extends Solve5{
    int[] merge(int[] a,int[] b){
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
        System.out.print("Enter your array 1 size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array 1 element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your array 2 size: ");
        int n1 = sc.nextInt();
        int[] b= new int[n];
        System.out.print("Enter your array 2 element: ");
        for(int i=0;i<n1;i++){
            b[i]=sc.nextInt();
        }
        MergeTwoArrayAndPrintFinalArray ob = new MergeTwoArrayAndPrintFinalArray();
        int[] g = ob.merge(a,b);
        System.out.print("Merged Array: ");
        for (int i = 0; i <g.length; i++) {
            if(g[i]!=0){
                System.out.print(g[i]+" ");
            }
        }

    }
}