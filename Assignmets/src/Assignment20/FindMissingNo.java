/*Q9. Wap enter an array in sequence from 1 to 10 and Find missing number in an array using class and object.*/
package Assignment20;

import java.util.Scanner;
abstract class Find{
    abstract void missing(int[] a);
}
class FindNo extends Find{
    public void missing(int[] a){
        int sum =0;
        for (int i = 1; i <=10 ; i++) {
            sum+=i;
        }
        int total_sum=0;
        for (int i = 0; i<a.length ; i++) {
            total_sum+=a[i];
        }
        int miss=sum-total_sum;
        System.out.print("Missing number is: "+miss);
    }
}
public class FindMissingNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        Find ob = new FindNo();
        ob.missing(a);
    }
}
/***********************OUTPUT**************************
 Enter Array size: 9
 Enter Array element: 1 2 3 4 5 7 8 9 10
 Missing number is: 6
 *******************************************************/