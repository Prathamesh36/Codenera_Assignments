/*Q10. String s="Welcome to the India"
     Output: Wlcme t th nd*/
package Assignment23;

import java.util.Scanner;

public class RemoveVowelsFromWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("OUTPUT: ");
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='I'|| ch=='o' || ch=='u'){

            }
            else{
                System.out.print(s.charAt(i));
            }

        }
    }
}
/*********************OUTPUT************************
 Enter your String: Welcome to the India
 OUTPUT: Wlcm t th nd
 ***************************************************/