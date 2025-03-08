package NOV16.StringQues;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        int sum=0;
        StringBuilder sb =  new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if(Character.isDigit(sb.charAt(i))){
                sum+=(int)(sb.charAt(i))-48;
                sb.deleteCharAt(i);
                i--;
            }
        }
        String b=sb.toString();
        char[] ch = b.toCharArray();
        Arrays.sort(ch);
        b=new String(ch);

        b=(sum>0)?b+(String.valueOf(sum)):b;
    }
}
