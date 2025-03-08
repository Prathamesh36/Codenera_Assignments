/*Q7. String s="Welcome to the India"
     Output: Wlcme t th nd
*/
package NOV7.TejasSir;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("OUTPUT: ");
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='I'|| ch=='o' || ch=='u'){
                continue;
            }
            else{
                System.out.print(s.charAt(i));
            }

        }
    }
}
