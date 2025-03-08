/*Q5.Write a Java method to check whether a string is a valid password. Go to the editor

Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.*/
package Test10;
import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char []ch = s.toCharArray();
        int c=0;
        int k=0;
        int g=0;
        int l=0;
        if (ch.length>=10){
            c++;
        }
        for (int i = 0; i < ch.length ; i++) {

            if(Character.isLetter(ch[i])){
                k++;
            }
            else if(!Character.isLetter(ch[i]) || !Character.isDigit(ch[i])){
                g++;
            }
            else if(Character.isDigit(ch[i])){
                l++;
            }
        }
        if(c>1 && k>1 && g==0 && l>1){
            System.out.print("Password is Valid");

        }
        else{
            System.out.print("Password is not Valid");
        }
    }
}
/************************OUTPUT*****************************
 Enter your String: Codenera@5632
 Password is not Valid
 ************************************************************/