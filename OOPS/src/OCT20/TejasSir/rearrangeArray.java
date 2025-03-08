package OCT20.TejasSir;

import java.util.Scanner;

public class rearrangeArray {

    public int[] rearrange(int a[]){
        for(int i=1;i<a.length-1;i=i+2){

            if(a[i]<a[i-1]){
                int temp = a[i];
                a[i]=a[i-1];
                a[i-1]=temp;
            }
            if(a[i]<a[i+1]){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        rearrangeArray ob = new rearrangeArray();
        int g[]=ob.rearrange(a);
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");

        }

    }
}
