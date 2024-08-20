/*Q7.  Wap input an array and delete any element from it using class and
    object.*/
package Assignment20;

import java.util.Scanner;

abstract class DeleteElmtt{
    abstract void Rot(int[] a);
}
class DeleteElmt1 extends DeleteElmtt{
    public void Rot(int[] a){
        System.out.print("Array after deleting last element: ");
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}

public class DeleteElmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }

        DeleteElmtt ob = new DeleteElmt1();
        ob.Rot(a);
    }
}
/***********************OUTPUT**************************
 Enter Array size: 5
 Enter Array element: 1 2 3 4 5
 Array after deleting last element: 1 2 3 4
 *******************************************************/