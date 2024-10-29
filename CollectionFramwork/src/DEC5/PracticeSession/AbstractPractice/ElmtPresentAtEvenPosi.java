package DEC5.PracticeSession.AbstractPractice;
import java.util.Scanner;

abstract class Solve4{
    abstract int Count(int[] arr);
    abstract int[] evenPosi(int[] arr);
}

public class ElmtPresentAtEvenPosi extends Solve4{
    int Count(int[] arr){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0) c++;
        }
        return c;
    }
    int[] evenPosi(int[] arr){
        int sum=0;
        int[] b = new int[(arr.length/2)+1];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                b[k]=arr[i];
                k++;
            }
        }
        return b;
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
        ElmtPresentAtEvenPosi ob = new ElmtPresentAtEvenPosi();
        System.out.println("Count Of even position elements: "+ob.Count(a));
        int[] g = ob.evenPosi(a);
        System.out.print("even position elements: ");
        for (int i = 0; i <g.length; i++) {
            if(g[i]!=0){
                System.out.print(g[i]+" ");
            }
        }

    }
}