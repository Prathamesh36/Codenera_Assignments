package OCT18.AmanSir;

import java.util.Scanner;

public class reverseArray {

    int s;
    int[] a;
    reverseArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }
    public int[] reverse(){
        int b[] = new int[a.length];
        int x=0;
        for (int i=a.length-1;i>=0;i--){
            b[x]=a[i];
            x++;
        }
        return b;
    }

    public static void main(String[] args) {
        reverseArray ob = new reverseArray();
        System.out.print("Reverse Array is: ");
        int g[]=ob.reverse();
        for (int el:g) {
            System.out.print(el+" ");
        }
    }
}
