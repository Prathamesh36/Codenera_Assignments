/*Q8. Write a Java program to count Uppercase, Lowercase, special characters and numeric values in a given string.*/
package PlacementQue1;

import java.util.Scanner;

public class Q8_CountUppLowerSpecialCharAndNumericValue {
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
            else{
                specialCharCount++;
            }
        }
        System.out.println("Digit Count: "+digitCount);
        System.out.println("UpperCase Count: "+upperCaseCount);
        System.out.println("LowerCase Count: "+lowerCaseCount);
        System.out.println("Special Character Count: "+specialCharCount);
    }
}
