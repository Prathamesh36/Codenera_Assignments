/*Write a function to check if a string contains only numeric characters.*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class Q11_CheckStringContainsNumericValue {

    public static int checkNumeric(String s){
        int c=0;
        for (char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        if(checkNumeric(s)==0){
            System.out.println("Given string not contains numeric value");
        }
        else {
            System.out.println("Give string contains numeric value");
        }
    }
}
/*******************************OUTPUT********************************
 Enter your String: codenera1
 Give string contains numeric value

 Enter your String: codenera
 Given string not contains numeric value
 **********************************************************************/