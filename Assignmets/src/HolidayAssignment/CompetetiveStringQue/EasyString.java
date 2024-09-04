/*Q13. Easy string (google)
Example 1:
Input: S = "aaABBb"
Output: "3a3b"
Explanation: As 'a' appears 3 times
consecutively and 'b' also 3 times,
and 'b' and 'B' considered as same.
Example 2:
Input: S = "aaacca"
Output: "3a2c1a"
Explanation: As 'a' appears 3 times
consecutively and 'c' also 2 times,
and then 'a' 1 time.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class EasyStringg{
    public String Easy(String s){

        String str =s.toLowerCase();

        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

public class EasyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        EasyStringg ob = new EasyStringg();
        System.out.print("OUTPUT: ");
        System.out.print(ob.Easy(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: aaABBb
 OUTPUT: 3a3b
 ****************************************************/