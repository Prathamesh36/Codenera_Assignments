/*Q18. Ordering of strings (walmart)
You will be given N number of strings. You have to find the lexicographically smallest string and
the lexicographically largest string among these strings.
Example 1:
Input:
N = 3
strings = a , ab , abc
Output: a abc
Explanation: Lexicographically smallest is
"a" and lexicographically largest is
"abc".*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Arrays;
import java.util.Scanner;

class Ordering{
    public String[] Order(String s[], int n){
        Arrays.sort(s);
        String[] res = new String[2];
        res[0] = s[0];
        res[1] = s[s.length-1];
        return res;
    }
}

public class OrderingOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Array size: ");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.print("Enter Your String elements: ");
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();
        }
        Ordering ob = new Ordering();
        String g[]=ob.Order(s,n);
        System.out.print("OUTPUT: ");
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i]+" ");
        }
    }
}
/***********************OUTPUT************************
 Enter String Array size: 3
 Enter Your String elements: a ab abc
 OUTPUT: a abc
 ****************************************************/