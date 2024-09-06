/*Q14. Special array reversal (google)
Example 1:
Input: S = "A&B"
Output: "B&A"
Explanation: As we ignore '&' and
then reverse, so answer is "B&A".
Example 2:
Input: S = "A&x#
Output: "x&A#"
Explanation: we swap only A and x.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class ArrayReverse{
    public String Reverse(String a){
        char[] s =  a.toCharArray();
        int i=0, j =  s.length-1;
        while(i < j){
            if(!(s[i]>='a' && s[i]<='z') && !(s[i]>='A' && s[i]<='Z')){
                i++;
            }
            else if(!(s[j]>='a' && s[j]<='z') && !(s[j]>='A' && s[j]<='Z')){
                j--;
            }
            else{
                char temp =  s[i];
                s[i] =  s[j];
                s[j] =  temp;
                i++; j--;

            }
        }
        return String.valueOf(s);
    }
}
public class SpecialArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        ArrayReverse ob = new ArrayReverse();
        System.out.print("OUTPUT: ");
        System.out.print(ob.Reverse(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: A&x#
 OUTPUT: x&A#
 ****************************************************/