package OCT25.TejasSir2;

import java.util.Scanner;

public class ReverseArray {
    int a[];
    ReverseArray(int[] a){
        this.a=a;
    }
    public void reverse(){
        System.out.print("Reverse array is: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        ReverseArray ob= new ReverseArray(a);
        ob.reverse();
    }
}
