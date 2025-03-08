package NOV7.TejasSir;

import java.util.Scanner;

public class RemoveDuplicateElmts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter Character: ");
        char a = sc.next().charAt(0);
        System.out.print("Output: ");
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if(ch==a){
                continue;
            }
            else{
                System.out.print(ch);
            }
        }
    }
}
