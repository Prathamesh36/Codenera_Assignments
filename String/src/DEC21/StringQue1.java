/*Q2.Given two numbers as strings. The numbers may be very large (may not fit in long long int), the task is to find sum of these two numbers.

Examples:

Input  : str1 = "3333311111111111",
         str2 =   "44422222221111"
Output : 3377733333332222*/
package DEC21;

import java.util.Scanner;

public class StringQue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String w = sc.next();
        System.out.print("Enter Your String: ");
        String w1 = sc.next();
        StringBuffer sc1 = new StringBuffer(w);
        StringBuffer sc2 = new StringBuffer(w1);
        StringBuffer c = new StringBuffer();
        sc1.reverse();
        sc2.reverse();
        int max =Math.max(w.length(),w1.length());
        int min =Math.min(w.length(),w1.length());
        //int sum =0;
        int carry=0;
        for (int i = 0; i < min; i++) {
            int digit = Character.getNumericValue(sc1.charAt(i));
            int digit1 = Character.getNumericValue(sc2.charAt(i));
            int sum=digit+digit1+carry;
            c.append(sum%10);
            carry=sum/10;
        }
        for (int i = min; i < max; i++) {
            int digit = Character.getNumericValue(sc1.charAt(i));
            int sum=digit+carry;
            c.append(sum%10);
            carry=sum/10;
            if(carry>0){
                c.append(carry);
            }
        }
        c.reverse();
        System.out.print("Sum: "+c);
    }
}
