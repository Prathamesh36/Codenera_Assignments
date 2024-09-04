/*Q3. Extract the integers (Zoho)
Input:
s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
3: Rishabh Gupta56"
Output: 1 2 3 56
Explanation:
1, 2, 3, 56 are the integers present in s.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class ExtractIntegers{
    public void Extract(String str){
        int[] ans = new int[str.length()/2];
        System.out.print("OUTPUT: ");
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.print(ch+" ");
            }
        }
    }
}

public class ExtractTheIIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        ExtractIntegers ob = new ExtractIntegers();
        ob.Extract(str);
    }
}
/***********************OUTPUT************************
 Enter Your String: 1: Prakhar Agrawal, 2: Manish Kumar Rai,3: Rishabh Gupta56
 OUTPUT: 1 2 3 5 6
 ****************************************************/
