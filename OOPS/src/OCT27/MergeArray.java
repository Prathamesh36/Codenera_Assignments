package OCT27;


import java.util.Scanner;


class Merge{
    int a[];
    int b[];
    Merge(int a[],int b[]){
        this.a=a;
        this.b=b;
    }
    public int[] Arrayyy(){
        int c[] = new int[a.length+b.length];

        int k= b.length-1;
        int u=0;
        for(int i=0;i<c.length;){
            c[i]=a[u];
            i++;
            u++;
            c[i]=b[k];
            k--;
            i++;
        }
        return c;
    }
}

public class MergeArray {
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
        Merge ob = new Merge(a,b);
        int g[]=ob.Arrayyy();
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i]+" ");
        }
    }
}
