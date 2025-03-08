/*Q5.Wap replace 0's from the square of  the next element of array using constructor.
   your array is-{2,0,4,8,0,5,0,5,8};
*/
package OCT25.TejasSir2;

import java.util.Scanner;

public class Replace0WithNextElmtSqr {
    int a[];
    Replace0WithNextElmtSqr(int[] a){
        this.a=a;
    }
    public void replace(){

        for(int i=0;i<a.length;i++){
           if(a[i]==0){
               a[i]=a[i+1]*a[i+1];
           }
        }
        System.out.print("OUTPUT: ");
        for(int i=0;i<a.length;i++){
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
        Replace0WithNextElmtSqr ob= new Replace0WithNextElmtSqr(a);
        ob.replace();
    }
}
