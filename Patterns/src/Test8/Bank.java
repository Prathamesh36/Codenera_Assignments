/*
15.Develop a Java program to simulate a simple banking system. Create classes for "Account" and "Bank"
with features like account creation, deposit, withdrawal, and balance checking*/
package Test8;

import java.util.Scanner;

class Account{
    Scanner sc = new Scanner(System.in);
    int balance =0;
    public void Balance(){
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
            System.out.println("Your balance is less than " + balance + "\tTransaction failed...!!" );
        }
    }

}


public class Bank extends Account{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice =7;
        System.out.println("*********************");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.WithDraw");
        System.out.println("*********************");
        Bank ob = new Bank();
        while(choice != 0){
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ob.Balance();
                    break;

                case 2:
                    ob.deposit();
                    break;

                case 3:
                    ob.Withdraw();
                    break;

                default:
                    System.out.println("Enter Valid input");

            }
        }
        System.out.println("Thank You!!");
    }
}
