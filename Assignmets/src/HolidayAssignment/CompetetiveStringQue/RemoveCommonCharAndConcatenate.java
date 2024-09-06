/*Q6. Remove common characters and concatenate (Oracle)
Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.*/
package HolidayAssignment.CompetetiveStringQue;
import java.util.Scanner;

class RemoveCommonChar{
    public String Remove(String a,String b){
        String s="";
        for (int i = 0; i < a.length(); i++) {

            if(!b.contains(String.valueOf(a.charAt(i)))&& !s.contains(String.valueOf(a.charAt(i)))){
                s+=a.charAt(i);
            }

        }
        for (int i = 0; i < b.length(); i++) {
            if(!a.contains(String.valueOf(b.charAt(i)))&& !s.contains(String.valueOf(b.charAt(i)))){
                s+=b.charAt(i);
            }
        }
        return s;

    }
}

public class RemoveCommonCharAndConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        System.out.print("Enter Your String: ");
        String str1 = sc.nextLine();
        RemoveCommonChar ob = new RemoveCommonChar();
        System.out.print("OUTPUT: ");
        System.out.print(ob.Remove(str,str1));
    }
}
/***********************OUTPUT************************
 Enter Your String: aacdb
 Enter Your String: gafd
 OUTPUT: cbgf
 ****************************************************/