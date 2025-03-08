package OCT20.TejasSir;

import java.util.Scanner;

public class roatateArray {

    public int[] rotate(int a[]){
        int temp = a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;

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
        roatateArray ob = new roatateArray();
        System.out.print("Array after one cylindrical rotation: ");
        int g[]=ob.rotate(a);
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");

        }

    }
}
