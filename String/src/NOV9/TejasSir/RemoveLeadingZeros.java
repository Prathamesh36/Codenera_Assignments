package NOV9.TejasSir;

import java.util.Scanner;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();
        //char a []=str.toCharArray();
        String p ="";
        int k=1;
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if(ch=='0'&& k==1){

            }
            else if(ch!='0'){
                p+=ch;
                k=0;
            }
        }
        System.out.print(p);
    }
}
