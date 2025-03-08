package OCT17.AmanSir;

import java.util.Scanner;

public class rotateArrayClockwise {

    public int[] rotation(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of ratations: ");
        int k = sc.nextInt();

        for (int j=0;j<k;j++) {
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }
        return a;
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

        rotateArrayClockwise ob = new rotateArrayClockwise();
        int g[] = ob.rotation(a);
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");
        }
    }
}
