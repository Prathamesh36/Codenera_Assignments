package ThinkitiveTechPractive;

import java.util.Scanner;

public class longestNonPaliSubString {

    public static boolean isPali(String s,int i ,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int longestNonPaliSubString(String s){
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!isPali(s,i,j) && (j-i+1)>max){
                    max = (j-i+1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("OUTPUT: "+longestNonPaliSubString(s));
    }
}
