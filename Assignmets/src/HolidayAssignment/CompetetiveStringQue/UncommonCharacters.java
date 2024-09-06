/*Q5. Uncommon characters (Zoho)
Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation:
The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
are either present in A or B, but not in both.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Arrays;
import java.util.Scanner;

class UncommonCharacter{
    public String Uncommon(String a,String b){
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
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);

    }
}

public class UncommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        System.out.print("Enter Your String: ");
        String str1 = sc.nextLine();
        UncommonCharacter ob = new UncommonCharacter();
        System.out.print("OUTPUT: ");
        System.out.print(ob.Uncommon(str,str1));
    }
}
/***********************OUTPUT************************
 Enter Your String: geeksforgeeks
 Enter Your String: geeksquiz
 OUTPUT: fioqruz
 ****************************************************/