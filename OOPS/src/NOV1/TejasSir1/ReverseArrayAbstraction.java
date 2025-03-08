package NOV1.TejasSir1;

import java.util.Scanner;

class reverse1 extends reverse{
    public void rev(int a[]){
        System.out.print("Reverse Array: ");
        for (int i = a.length-1; i>=0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}

public class ReverseArrayAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        reverse1 ob = new reverse1();
        ob.rev(a);
    }
}
