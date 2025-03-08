/*Write a program to find the frequency of each element in an array.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q11_FindFrequencyOfArrayElmts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[]= new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        int c=1;
        System.out.println("Elements\tFrequency");
        for (int i = 0; i < a.length; i++) {
            c=1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1){
                System.out.println("\t"+a[i]+"\t\t\t"+c);
            }
        }
    }
}
/************************OUTPUT****************************
 Enter Array size: 8
 Enter Array element: 5 4 2 1 6 5 3 2
 Elements	Frequency
 5			2
 4			1
 2			2
 1			1
 6			1
 3			1
 *********************************************************/
