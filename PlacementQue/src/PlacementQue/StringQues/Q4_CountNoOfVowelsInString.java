/*Write a function to count the number of vowels in a string.*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class Q4_CountNoOfVowelsInString {

    public static int vowel(String s){
        String vowel = "AEIOUaeiou";
        int count=0;
        for(char ch : s.toCharArray()){
            if(vowel.indexOf(ch)!=-1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("Total No. of Vowels: "+vowel(s));
    }
}
/*******************************OUTPUT********************************
 Enter your String: Statement
 Total No. of Vowels: 3
 **********************************************************************/