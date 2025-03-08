/*9.Move all the negative elements to one side of the array*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class SortNegativeElmt {

    int s;
    int[] a;
    SortNegativeElmt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }

    public void sortNegative(){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++) {
                if (a[i] < 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Array after moving negatives to one side: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        SortNegativeElmt ob = new SortNegativeElmt();
        ob.sortNegative();
    }
}
