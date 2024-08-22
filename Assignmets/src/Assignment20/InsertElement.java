/*Q8.Wap input an array and insert any element  at any position using class and object.*/
package Assignment20;

import java.util.Scanner;

abstract class InsertElmt{
    abstract void Rot(int[] a,int n);
}
class InsertElmt1 extends InsertElmt{
    public void Rot(int[] a,int n){
        int b[]=new int[a.length+1];
        System.out.print("Array after inserting element: ");
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        b[a.length]=n;
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter number to insert: ");
        int n= sc.nextInt();
        InsertElmt ob = new InsertElmt1();
        ob.Rot(a,n);
    }
}
/***********************OUTPUT**************************
 Enter Array size: 5
 Enter Array element: 1 2 3 4 5
 Enter number to insert: 6
 Array after inserting element: 1 2 3 4 5 6
 *******************************************************/
