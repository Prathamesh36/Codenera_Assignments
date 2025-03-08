package OCT17.AmanSir;

import java.util.Scanner;

public class commonInBothArray {
    Scanner sc = new Scanner(System.in);
    public int[] common(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        int d[] = new int[5];
        int t=0;
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }

        for(int i=0;i<c.length;i++){
            int k=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(c[i]!=-1 && k>1){
                d[t]=c[i];
                t++;
            }

        }

        return d;
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

        commonInBothArray ob = new commonInBothArray();
        int g[] =ob.common(a,b);
        System.out.print("Common element: ");
        for(int i=0;i<g.length;i++){
            if(g[i]!=0){
                System.out.print(g[i]+" ");
            }
        }
    }
}
