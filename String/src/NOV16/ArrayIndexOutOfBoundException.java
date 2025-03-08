package NOV16;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] =new int[s];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Array elements : ");

        try{
            for (int i = 0; i <= a.length; i++) {
                System.out.print(a[i]+" ");
            }
        }
        catch (Exception e){
            System.out.println();
            System.out.print("Array index Out of Bound....");
        }
    }
}
