/*Q2.
Java| Swap commas and dots in a String
Input : 14, 625, 498.002
Output : 14.625.498, 002 */
package PlacementQue1;

import java.util.Scanner;

public class Q2_SwapCommasAndDotsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        StringBuilder a= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                continue;
            }
            if(s.charAt(i)==','){
                a.append('.');
            }
            else if(s.charAt(i)=='.'){
                a.append(',');
            }
            else{
            a.append(s.charAt(i));
            }
        }
        System.out.println("OUTPUT: "+a);
        
    }
}
