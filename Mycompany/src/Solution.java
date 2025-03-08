import java.util.Scanner;

/*
You are given a mobile phone with a keyboard containing 28 keys: 26 letter keys (from "a" to "z") and two special keys:
backspace (represented by the capital letter "B") and caps lock (represented by the capital letter "C").
When pressing a letter key, the appropriate letter appears on the screen, next to the previously entered text.
The letter is in uppercase if caps lock is activated, and in lowercase otherwise.
The status of caps lock is switched (activated or deactivated) when the caps lock key is pressed. Its initial state is deactivated.
The backspace key deletes the most recent letter that appeared on the screen. If the string is empty, backspace does nothing.
Write a function:
class Solution (public String solution(String S); }
that, given a string S consisting of N letters representing the sequence of pressed keys (each letter of the string
 represents a key), returns the string that appears on the screen as a result.

Examples:
1. Given S = "CrCellBax", your function should return "Relax". Only "r" is a capital because caps lock is activated
before it and deactivated just after it. The second "1" is deleted because backspace is pressed after it.
2. Given S = "CgCoodIBCICuck", your function should return "GoodLuck".
3. Given S = "aCaBBCCab", your function should return "AB".
4. Given S = "aBB", your function should return".
Assume that:

• string S consists only of lowercase letters (a-z), "B" and/or "C":
N is an integer within the range [1..500].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment*/
public class Solution {
/*
    public static String solution(String str){
        boolean capsLock=false;
        String ans ="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='C'){
                if(capsLock){
                    i++;
                }
                ans+=(char)(str.charAt(i)-32);
                capsLock = true;
            }
            else if (str.charAt(i)=='C' && capsLock){
                capsLock = false;
            }
            else if(str.charAt(i)=='B'){
                ans = ans.substring(0,ans.length()-1);
            }
            else {
                ans += str.charAt(i);
            }
        }
        return ans;
    }
*/

    public static String solution(String S) {
        // Initialize the caps lock state to false
        boolean capsLock = false;
        // Use a StringBuilder to build the output string efficiently
        StringBuilder output = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : S.toCharArray()) {
            if (ch == 'C') {
                // Toggle the caps lock state
                capsLock = !capsLock;
            } else if (ch == 'B') {
                // Handle the backspace, remove the last character if present
                if (output.length() > 0) {
                    output.deleteCharAt(output.length() - 1);
                }
            } else {
                // Append the character considering the caps lock state
                if (capsLock) {
                    output.append(Character.toUpperCase(ch));
                } else {
                    output.append(Character.toLowerCase(ch));
                }
            }
        }

        // Convert the StringBuilder to a string and return it
        return output.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();
        System.out.print("Output: "+solution(str));
    }
}
