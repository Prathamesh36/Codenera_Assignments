/*Q8 Keypad typing (Microsoft)
Input:
S = geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357
in decimal when we type it using the given
keypad.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class KeyPadTypingg{
    public String Typing(String a){
        StringBuilder sb = new StringBuilder();
        char[] ch = a.toCharArray();
        for (int i = 0; i <ch.length; i++) {
            if(ch[i]>='a' && ch[i]<='c'){
                sb.append('2');
            }
            if(ch[i]>='d' && ch[i]<='f'){
                sb.append('3');
            }
            if(ch[i]>='g' && ch[i]<='i'){
                sb.append('4');
            }
            if(ch[i]>='j' && ch[i]<='l'){
                sb.append('5');
            }
            if(ch[i]>='m' && ch[i]<='o'){
                sb.append('6');
            }
            if(ch[i]>='p' && ch[i]<='s'){
                sb.append('7');
            }
            if(ch[i]>='t' && ch[i]<='v'){
                sb.append('8');
            }
            if(ch[i]>='w' && ch[i]<='z'){
                sb.append('9');
            }
        }
        return sb.toString();
    }
}

public class KeypadTyping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        KeyPadTypingg ob = new KeyPadTypingg();
        System.out.print("OUTPUT: ");
        System.out.print(ob.Typing(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: geeksforgeeks
 OUTPUT: 4335736743357
 ****************************************************/