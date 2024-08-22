/*Q6. Wap input an array and rotate it by the no given through user using class and object.*/
package Assignment20;

import java.util.Scanner;
abstract class Rotate{
    abstract void Rot(int[] a,int r);
}
class Rotate1 extends Rotate{

    public void Rot(int[] a,int r){
        int res= 0;
        System.out.print("Array after rotation: ");
        for(int j=1;j<=r;j++) {
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter number of rotations: ");
        int r = sc.nextInt();
        Rotate ob = new Rotate1();
        ob.Rot(a,r);
    }
}
/***********************OUTPUT**************************
 Enter Array size: 5
 Enter Array element: 1 2 3 4 5
 Enter number of rotations: 2
 Array after rotation: 4 5 1 2 3
 *******************************************************/