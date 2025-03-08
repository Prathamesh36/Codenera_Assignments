/*4.Write a program to sort the given array*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class SortArray {
    int s;
    int[] a;
    SortArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }

    public void sort(){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        SortArray ob = new SortArray();
        ob.sort();
    }
}
