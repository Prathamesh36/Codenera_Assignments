/*Q10. Write a Java program to check whether a given string contains a
capital letter, a lower case letter, a number and a minimum length.
Sample Output:
Input the string: W3resource
['Valid string.']*/
package PlacementQue1;

import java.util.Scanner;

public class Q10_CheckGivenStringValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int digitCount=0;
        int upperCaseCount=0;
        int lowerCaseCount=0;
        int specialCharCount=0;
        for (Character ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                digitCount++;
            }
            else if(Character.isUpperCase(ch)){
                upperCaseCount++;
            }
            else if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }
        }
        if(digitCount>=1 && upperCaseCount>=1 && lowerCaseCount>=1){
            System.out.println("Valid String");
        }
        else{
            System.out.println("Invalid String");
        }

    }
}
