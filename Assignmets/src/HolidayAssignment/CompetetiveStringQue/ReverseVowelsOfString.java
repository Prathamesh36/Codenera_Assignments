/*Q1. Reverse the vowels only (Flipkart)
S = "practice"
Output: prectica
Explanation: The vowels are a, i, e
Reverse of these is e, i, a.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.next();
        char[] ch = str.toCharArray();
        String vowel= "aeiouAEIOU";
        int start = 0;
        int end =str.length()-1;
        while(start<end){

            while(vowel.indexOf(ch[start])==-1){
                start++;
            }
            while(vowel.indexOf(ch[end])==-1){
                end--;
            }

            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        System.out.print("OUTPUT: ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
/***********************OUTPUT************************
 Enter Your String: practice
 OUTPUT: prectica
 ****************************************************/
