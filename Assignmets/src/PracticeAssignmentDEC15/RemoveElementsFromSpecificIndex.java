/*1)write a simple program to remove elemnts from  specific index from array.
ex->input:abdfgek
start index->2
number of elemnts to remove->3
output:abek
*/
package PracticeAssignmentDEC15;

import java.util.Scanner;

public class RemoveElementsFromSpecificIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        char[] a = new char[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.next().charAt(0);
        }

        System.out.print("Enter Starting Index: ");
        int startIdx=sc.nextInt();
        System.out.print("Enter number of elements to remove: ");
        int noElmts = sc.nextInt();
        int flag =0;
        System.out.print("OUTPUT: ");
        for (int i = 0 ; i <a.length; i++) {
            if(i>=startIdx && flag!=noElmts){
                flag++;
                continue;
            }
            else {
                System.out.print(a[i]);
            }
        }
    }
}
