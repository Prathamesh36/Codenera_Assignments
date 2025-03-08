import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            try {
                int choice = scanner.nextInt();

                if (choice == 8) {
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                }

                if (choice < 1 || choice > 8) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                    continue;
                }

                double result;

                if (choice >= 1 && choice <= 5) {
                    double num1 = getUserInput("Enter the first number: ");
                    double num2 = getUserInput("Enter the second number: ");

                    switch (choice) {
                        case 1:
                            result = add(num1, num2);
                            break;
                        case 2:
                            result = subtract(num1, num2);
                            break;
                        case 3:
                            result = multiply(num1, num2);
                            break;
                        case 4:
                            result = divide(num1, num2);
                            break;
                        case 5:
                            result = percentage(num1, num2);
                            System.out.printf("Result: %.2f%% of %.2f is %.2f\n", num2, num1, result);
                            continue;
                        default:
                            result = 0;  // Default case for the compiler
                    }
                } else {
                    double num = getUserInput("Enter the number: ");

                    switch (choice) {
                        case 6:
                            result = square(num);
                            break;
                        case 7:
                            result = squareRoot(num);
                            break;
                        default:
                            result = 0;  // Default case for the compiler
                    }
                }

                System.out.printf("Result: %.2f\n", result);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Percentage");
        System.out.println("6. Square");
        System.out.println("7. Square Root");
        System.out.println("8. Quit");
        System.out.print("Enter your choice (1-8): ");
    }

    private static double getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }
    }

    private static double add(double x, double y) {
        return x + y;
    }

    private static double subtract(double x, double y) {
        return x - y;
    }

    private static double multiply(double x, double y) {
        return x * y;
    }

    private static double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }

    private static double percentage(double x, double y) {
        return (x * y) / 100;
    }

    private static double square(double x) {
        return x * x;
    }

    private static double squareRoot(double x) {
        if (x < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(x);
    }
}
