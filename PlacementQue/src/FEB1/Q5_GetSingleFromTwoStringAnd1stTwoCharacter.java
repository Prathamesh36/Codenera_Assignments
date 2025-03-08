/*5. Write a Java program to get a single string from two given strings, separated by a space and swap the first two characters of each string.
Sample String : 'abc', 'xyz'
Expected Result : 'xyc abz'*/
package FEB1;

import java.util.Scanner;

public class Q5_GetSingleFromTwoStringAnd1stTwoCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter your String: ");
        String s1 = sc.nextLine();
        StringBuilder as= new StringBuilder();
        StringBuilder as1= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i<2){
                as.append(s1.charAt(i));
                as1.append(s.charAt(i));
            }
            else {
                as.append(s.charAt(i));
                as1.append(s1.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(as);
        ans.append(" ");
        ans.append(as1);
        System.out.println("Output: "+ans);


    }
}
/**********************OUTPUT***************************
 Enter your String: abc
 Enter your String: xyz
 Output: xyc abz
 ********************************************************/