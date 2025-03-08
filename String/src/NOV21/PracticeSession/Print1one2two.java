/*1.
input: 123
output: one two three
*/
package NOV21.PracticeSession;

import java.util.Scanner;

public class Print1one2two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String s = sc.next();
        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='1'){
                sb.append("one ");
            }
            if(ch[i]=='2'){
                sb.append("two ");
            }
            if(ch[i]=='3'){
                sb.append("three ");
            }
            if(ch[i]=='4'){
                sb.append("four ");
            }
            if(ch[i]=='5'){
                sb.append("five ");
            }
            if(ch[i]=='6'){
                sb.append("six ");
            }
            if(ch[i]=='7'){
                sb.append("seven ");
            }
        }
        System.out.print("OUTPUT: "+sb);
    }
}
