package PlacementQue1;

import java.util.Scanner;

public class Q7_SwapCommasAndDots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        StringBuilder a= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==','){
                a.append('.');
            }
            else if(s.charAt(i)=='.'){
                a.append(',');
            }
            else{
                a.append(s.charAt(i));
            }
        }
        System.out.println("OUTPUT: "+a);

    }
}
