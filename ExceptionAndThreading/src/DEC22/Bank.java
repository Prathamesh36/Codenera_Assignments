package DEC22;

import java.util.Scanner;

class insufficientBal extends Exception{
    insufficientBal(String e){
        super(e);
    }
}

class BankAccount{
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

    public void Withdraw() throws insufficientBal {
        System.out.print("Enter amount to Withdraw: ");
        int draw = sc.nextInt();
        if(balance<draw){
            throw new insufficientBal("Insufficient Balance! Your Account Balance is: "+balance);
        }
        else{
            System.out.println("Amount Withdraw Successfully");
            balance = balance - draw;
            System.out.print("Your Current Balance is: " + balance + "\n");
        }

    }
}

public class Bank {
    public static void main(String[] args) throws insufficientBal {
        Scanner sc = new Scanner(System.in);
        int choice =7;
        System.out.println("*********************");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.WithDraw");
        System.out.println("*********************");
        BankAccount ob = new BankAccount();
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
