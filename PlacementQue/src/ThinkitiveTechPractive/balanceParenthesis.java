package ThinkitiveTechPractive;

import java.util.Scanner;

public class balanceParenthesis {

    public static boolean isBalance(String s){
        int par1=0;
        int par2=0;
        int par3=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='{'){
                par1++;
            }
            else if(s.charAt(i)=='}'){
                par1--;
            }
            if(s.charAt(i)=='('){
                par2++;
            }
            else if(s.charAt(i)==')'){
                par2--;
            }
            if(s.charAt(i)=='['){
                par3++;
            }
            else if(s.charAt(i)==']'){
                par3--;
            }
        }
        if(par1==0 &&  par2 ==0 && par3==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your String: ");
        String a = sc.next();
        System.out.println("OUTPUT: "+isBalance(a));
    }
}
