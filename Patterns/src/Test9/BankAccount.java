/*Q8.Develop a Java program to model a simple banking system with classes for "Account," "SavingsAccount," and
"CheckingAccount." Include methods for deposit, withdrawal, and account information.*/
package Test9;

import java.util.Scanner;

class bankHead{
    Scanner sc = new Scanner(System.in);
    int balance =0;
    public void Information(){
        System.out.println("Account Information");
        System.out.print("Your Current Balance is: "+balance+"\n");
    }

    public void deposit(){
        System.out.print("Enter amount to Deposit: ");
        int amount = sc.nextInt();
        System.out.println("Amount Deposited Successfully");
        balance= balance+amount;
        System.out.print("Your Current Balance is: "+balance+"\n");
    }

    public void Withdraw(){
        System.out.print("Enter amount to Withdraw: ");
        int draw = sc.nextInt();
        if(draw<=balance) {
            System.out.println("Amount Withdraw Successfully");
            balance = balance - draw;
            System.out.print("Your Current Balance is: " + balance + "\n");
        }
        else{
            System.out.print("OOPS! Your Account Balance is: "+balance);
        }
    }

}

public class BankAccount extends bankHead{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice =7;
        System.out.println("*********************");
        System.out.println("1.Deposit");
        System.out.println("2.WithDraw ");
        System.out.println("3.Information");
        System.out.println("0.To Exit");
        System.out.println("*********************");
        BankAccount ob = new BankAccount();
        while(choice != 0){
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ob.deposit();
                    break;

                case 2:
                    ob.Withdraw();
                    break;

                case 3:
                    ob.Information();
                    break;


                default:
                    System.out.println("Enter Valid input");

            }
        }
        System.out.println("Thank You!!");
    }
}
/************************OUTPUT 1*****************************
 *********************
 1.Deposit
 2.WithDraw
 3.Information
 *********************

 Enter your choice: 1
 Enter amount to Deposit: 5000
 Amount Deposited Successfully
 Your Current Balance is: 5000

 Enter your choice: 2
 Enter amount to Withdraw: 3000
 Amount Withdraw Successfully
 Your Current Balance is: 2000

 Enter your choice: 3
 Account Information
 Your Current Balance is: 2000

 Enter your choice: 0
 Enter Valid input
 Thank You!!
 ************************************************************/