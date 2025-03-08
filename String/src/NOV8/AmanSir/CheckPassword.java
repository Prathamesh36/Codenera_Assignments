package NOV8.AmanSir;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char []ch = s.toCharArray();
        int c=0;
        int k=0;
        int g=0;
        int l=0;
        if (ch.length>=8){
            c++;
        }
        for (int i = 0; i < ch.length ; i++) {

            if(Character.isUpperCase(ch[i])){
                k++;
            }
            else if(Character.isLowerCase(ch[i])){
                g++;
            }
            else if(Character.isDigit(ch[i])){
                l++;
            }
        }
        if(c==0 || k==0||g==0||l==0){
            System.out.print("Not a Perfect Password");
        }
        else{
            System.out.print("Perfect Password");
        }
    }
}
