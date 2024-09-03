/*37.	Write a program to find the maximum element in an array.*/
package HolidayAssignment.Array;
import java.util.Scanner;

public class FindMaxElmt {
    public int maxx(int a[]){
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        FindMaxElmt ob= new FindMaxElmt();
        System.out.println("Max element is: "+ob.maxx(a));
    }
}
/************************OUTPUT****************************
 Enter Array size: 7
 Enter Array element: 5 4 8 6 1 3 7
 Max element is: 8
 *********************************************************/
