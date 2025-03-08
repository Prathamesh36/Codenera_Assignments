/*Uncommon characters (Zoho)
Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation:
The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
are either present in A or B, but not in both*/
package NOV18;

import java.util.Scanner;

public class UncommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        System.out.print("Enter Your String: ");
        String str1 = sc.nextLine();
        String str3=str+str1;
        StringBuffer sb = new StringBuffer();
        char[] ch= str3.toCharArray();
        for(int i=0;i<ch.length;i++){
            int c=1;
            for (int j = i+1; j <ch.length; j++) {
                if(ch[i]==ch[j]) {
                    c++;
                    ch[j] =' ';
                }
            }
            if(ch[i]!=' '&& c==1){
                sb.append(ch[i]);
            }
        }
        System.out.print("Uncommon Characters: ");
        System.out.print(sb);

    }
}
