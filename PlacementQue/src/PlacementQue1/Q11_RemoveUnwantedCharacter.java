package PlacementQue1;

import java.util.Scanner;

public class Q11_RemoveUnwantedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        for (Character ch : s.toCharArray()){
            if(Character.isLetter(ch) || Character.isSpaceChar(ch)){
                ans.append(ch);
            }
        }
        System.out.println("OUTPUT: "+ans);
    }
}
