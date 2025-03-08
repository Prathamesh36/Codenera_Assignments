/*Q.Write a Java program to find the average of an array and numbers greater than the average in an array.
Example1:-
Array = {10, 20, 30, 40, 50}
Average = 30.0
Numbers greater than average = 40, 50
*/
package JAN24;

import java.util.Scanner;

public class FindAverageAndGreaterThanAverageNumberFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        double avg = (double) sum/a.length;
        System.out.println("Average: "+avg);
        System.out.print("Numbers greater than average: ");
        for(int i=0;i<s;i++){
            if(a[i]>avg)
                System.out.print(a[i]+" ");
        }
    }
}
/**********************************OUTPUT*******************************
 Enter Array size: 5
 Enter Array element: 10 20 30 40 50
 Average: 30.0
 Numbers greater than average: 40 50
 ***********************************************************************/