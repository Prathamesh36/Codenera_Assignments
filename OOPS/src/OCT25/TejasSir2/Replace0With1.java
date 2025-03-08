/*Q7.Wap to input an array and find the 2nd min element using constructor.
Q8.WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78,
    54, 34, 10, 0, 34]
*/
package OCT25.TejasSir2;

import java.util.Scanner;

public class Replace0With1 {
    int a[];
    Replace0With1(int[] a){
        this.a=a;
    }
    public void replace(){

        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                a[i]=1;
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
        Replace0With1 ob= new Replace0With1(a);
        ob.replace();
    }
}
