/*3. Write a Java program to get a string made of the first 2 and last 2 characters of a given string. If the string length is less than 2, return the empty string instead.
Sample String : 'w3resource'
Expected Result : 'w3ce'
Sample String : 'w3'
Expected Result : 'w3w3'
Sample String : ' w'
Expected Result : Empty String*/
package FEB1;

import java.util.Scanner;

public class Q3_getStringMadeBy1stAndLastTwoCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String ans="";
        if(s.length()>=2){
            ans = s.substring(0,2).concat(s.substring(s.length()-2));
        }
        else {
            ans="\"\"";
        }
        System.out.println("Output: "+ans);
    }
}
/**********************OUTPUT***************************
 Enter your String: w3resource
 Output: w3ce

 Enter your String: w3
 Output: w3w3

 Enter your String: w
 Output: ""
 ********************************************************/