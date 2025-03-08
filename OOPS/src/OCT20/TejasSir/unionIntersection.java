package OCT20.TejasSir;

import java.util.Scanner;

public class unionIntersection {

    public int[] union(int[] a,int b[]){
        int c[] = new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }

        int y[] = new int[c.length];

        int w=0;

        for(int i=0;i<c.length;i++) {
            int k = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    k++;
                    c[j] = -1;
                }
            }
            if (k > 0 && c[i] > -1) {
                y[w]=c[i];
                w++;
            }
        }
        return y;
    }

    public int[] intersection(int a[],int b[]){
        int c[] = new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        int x[]= new int[c.length];

        int q=0;


        for(int i=0;i<c.length;i++){
            int k=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(k>1 && c[i]>-1){
                x[q]=c[i];
                q++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array 1 element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Enter your array 2 length: ");
        int n1= sc.nextInt();
        int b[]=new int[n1];
        System.out.print("Enter your array 2 element: ");
        for (int i=0;i<n1;i++){
            b[i]= sc.nextInt();
        }
        unionIntersection ob = new unionIntersection();
        System.out.print("Union is: ");

        int g[]=ob.union(a,b);
        for(int i=0;i<g.length;i++){
            if(g[i]!=0) {
                System.out.print(g[i] + " ");
            }

        }
        System.out.print("Intersection is: ");
        int j[]=ob.intersection(a,b);
        for(int i=0;i<j.length;i++){
            if(j[i]!=0) {
                System.out.print(j[i]+" ");
            }

        }
    }
}
