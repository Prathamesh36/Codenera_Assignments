package String;

import java.util.Scanner;

public class LongestSubStringWithoutRepeatingChars {

    public static int lengthOfLongestSubstring(String s) {
        String sb ="";
        int max=0;
        if (s == null || s.length() == 0) {
            return max;
        }
        if (s.length() == 1) {
            return 1;
        }
        for(int i=0;i<s.length();i++){
            if(!sb.contains(String.valueOf(s.charAt(i)))){
                sb+=s.charAt(i);
            }
            else{
                if(sb.length()>max){
                    max=sb.length();
                }
                sb="";
                i--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        System.out.println("length is: "+lengthOfLongestSubstring(s));
    }
}
