/*Q12. Rearrange a string
Example 1:
Input: S = "AC2BEW3"
Output: "ABCEW5"
Explanation: 2 + 3 = 5 and we print all
alphabets in the lexicographical order.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Arrays;
import java.util.Scanner;

class Rearrange{
    public String Arrange(String a){
        int sum=0;
        StringBuilder sb =  new StringBuilder(a);
        for (int i = 0; i < sb.length(); i++) {
            if(Character.isDigit(sb.charAt(i))){
                sum+=(sb.charAt(i))-48; //ASCII value of 1 is 49
                sb.deleteCharAt(i);
                i--;
            }
        }
        String b=sb.toString();
        char[] ch = b.toCharArray();
        Arrays.sort(ch);
        b=new String(ch);

        b=(sum>0)?b+sum:b;

        return b;
    }
}

public class RearrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        Rearrange ob = new Rearrange();
        System.out.print("OUTPUT: ");
        System.out.print(ob.Arrange(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: AC2BEW3
 OUTPUT: ABCEW5
 ****************************************************/