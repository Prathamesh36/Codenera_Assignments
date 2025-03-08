/*4.	Design a custom exception called InvalidDataException that is thrown when invalid data is
encountered during input processing. Implement a program demonstrating the use of this exception.
*/
package Test17;

import java.util.Scanner;

class InvalidDataException extends Exception {
        public InvalidDataException(String message) {
            super(message);
        }
    }

public class Q4_InvalidDataException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();

        try {
            if (num < 0) {
                throw new InvalidDataException("Invalid data: number cannot be negative.");
            }
            System.out.println("The number is " + num + ".");
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
        }
}

/***************************OUTPUT******************************
 Enter a number: -5
 Invalid data: number cannot be negative.
 ****************************************************************/