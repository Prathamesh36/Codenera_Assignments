/*Q15.
WAP to Find frequency of the an element in array*/
package Test9;

import java.util.Scanner;

public class FrequencyOfArray {
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
/************************OUTPUT 1*****************************
 Enter Array size: 10
 Enter Array element: 5 2 3 1 5 2 4 9 6 3
 Elements	Frequency
    5			2
    2			2
    3			2
    1			1
    4			1
    9			1
    6			1
 ************************************************************/