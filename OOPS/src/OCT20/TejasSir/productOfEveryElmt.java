package OCT20.TejasSir;

import java.util.Scanner;

public class productOfEveryElmt {

    public int[] product(int a[]){
        int total_Product=1;
        for(int i=0;i<a.length;i++){
            total_Product*=a[i];
        }
        int finalpro=0;
        for(int i=0;i<a.length;i++){
            finalpro=total_Product/a[i];
            a[i]=finalpro;
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
        System.out.print("Product: ");
        productOfEveryElmt ob = new productOfEveryElmt();
        int g[] = ob.product(a);
        for(int i=0;i<s;i++){
            System.out.print(g[i]+" ");
        }
    }
}

