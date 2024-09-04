/*Q10. Good or Bad string (Amazon)
Input:
S = aeioup??
Output:
1
Explanation: The String doesn't contain more
than 3 consonants or more than 5 vowels together.
So, it's a GOOD string.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class GoodBad{
    public int Good(String a){
        int vol=0;
        int cons=0;
        for(int i=0;i<a.length();i++){
            char c= a.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vol++;
                cons=0;
            }
            else if(c=='?'){
                vol++;
                cons++;
            }
            else{
                cons++;
                vol=0;
            }
            if(vol==6||cons==4)
                return 0;

        }
        return 1;
    }
}

public class GoodOrBadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        GoodBad ob = new GoodBad();
        System.out.print("OUTPUT: ");
        System.out.print(ob.Good(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: aeioup??
 OUTPUT: 1
 ****************************************************/