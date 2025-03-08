import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
}
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorOperations operation = new CalculatorOperations();
            while (true) {
                System.out.println("----------Enter Your Choice----------");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");
                System.out.println("5.Percentage");
                System.out.println("6.Square");
                System.out.println("7.Square root");
                System.out.println("8.Exit");
                System.out.println("-------------------------------------");
                try {
                    System.out.print("Enter your choice: ");
                    if(!sc.hasNextInt()){
                        throw new InvalidInputException("Invalid input, Enter Number");
                    }
                    int choice = sc.nextInt();                                                         //taking choice
                    if(choice <1 || choice>8) {
                        System.out.println("Invalid choice, Please enter number between 1 to 8");
                        continue;
                    }
                    if (choice == 8) {                                                                //Exit condition
                        System.out.println("Thank you !!");
                        break;
                    }

                    System.out.print("Enter first number: ");
                    if(!sc.hasNextDouble()){
                        throw new InvalidInputException("Invalid input, Enter Number");
                    }
                    double num1 = sc.nextDouble();                                                   //taking first num

                    if (choice != 6 && choice != 7) {
                        System.out.print("Enter second number: ");
                        if(!sc.hasNextDouble()){
                            throw new InvalidInputException("Invalid input, Enter Number");
                        }
                        double num2 = sc.nextDouble();                                              //taking second num

                        System.out.println("-------------------------------------");
                        switch (choice) {
                            case 1 -> System.out.printf("Addition: %.2f\n" , operation.addition(num1, num2));
                            case 2 -> System.out.printf("Subtraction: %.2f\n" , operation.subtract(num1, num2));
                            case 3 -> System.out.printf("Multiplication: %.2f\n" , operation.multiply(num1, num2));
                            case 4 -> System.out.printf("Division: %.2f\n" , operation.divide(num1, num2));
                            case 5 -> System.out.printf("Percentage: %.2f\n" , operation.percentage(num1, num2));
                        }
                        System.out.println("-------------------------------------");
                    } else {
                        System.out.println("-------------------------------------");
                        switch (choice) {
                            case 6 -> System.out.printf("Square: %.2f\n" , operation.square(num1));
                            case 7 -> System.out.printf("Square root: %.2f\n" , operation.squareRoot(num1));
                        }
                        System.out.println("-------------------------------------");
                    }
                } catch (InvalidInputException  | InputMismatchException e) {
                    System.out.println("Error: "+e);
                    sc.next();
                }
                catch (ArithmeticException | IllegalArgumentException e){
                    System.out.println("Error: "+e);
                    sc.nextLine();
                }
            }
    }
}
