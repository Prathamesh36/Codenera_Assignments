/*Q4. Front-Back Transformation - copy (Microsoft)
Input: S = "Hello"
Output: Svool
Explanation: 'H' is the 8th letter from the
beginning of alphabets, which is replaced by
'S' which comes at 8th position in reverse order
of alphabets. Similarly, all other letters are
replaced by their respective upper or lower case
letters accordingly.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

public class FrontBackTransformation {

    String convert(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                sb.append((char)(90-(s.charAt(i)-65)));
            }
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                sb.append((char)(122-(s.charAt(i)-97)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        FrontBackTransformation ob = new FrontBackTransformation();
        System.out.print("OUTPUT: ");
        System.out.print(ob.convert(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: Hello
 OUTPUT: Svool
 ****************************************************/