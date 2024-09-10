/*33.	Write a function to reverse the order of words in a string.*/
package HolidayAssignment.String;

import java.util.Scanner;

public class ReverseOrderOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a=s.split(" ");
        System.out.print("OutPut: ");
        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
/************************OUTPUT****************************
 Enter your String: I am from pune
 OutPut: pune from am I
 *********************************************************/