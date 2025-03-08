/*3.Write a program to reverse the array*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class ReverseArray {

    int s;
    int[] a;
    ReverseArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }

    public void reverse(){
        System.out.print("Reverse Array: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        ReverseArray ob = new ReverseArray();
        ob.reverse();
    }
}
