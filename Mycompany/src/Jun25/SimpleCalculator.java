package Jun25;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice =-1;
        while(choice==-1){
            System.out.print("Enter Number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Number 2: ");
            int num2 = sc.nextInt();
            System.out.println("----------Choices----------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("-------------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if(choice >=1 && choice<=4) {
                switch (choice) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println( num1 + " X " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        break;
                    default:
                        System.out.println("Please Enter valid choice");
                        break;
                }
                System.out.println();
            }
            System.out.println("To continue enter: -1, To exit enter: -2");
            choice = sc.nextInt();
        }
        System.out.println("Thank you!!!");
    }
}
