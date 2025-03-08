package OCT27;
import java.util.Scanner;

class bankHead{
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
            System.out.print("OOPS! Your Account Balance is: "+balance);
        }
    }
    public void Interest(){
        System.out.print("Enter Your Interest rate: ");
        int rate = sc.nextInt();
        rate = rate/10;
        double amountInt = balance+(rate*balance);
        System.out.print("Your balance after "+rate+"% Interest rate is: "+amountInt);
    }
}

public class Bank extends bankHead{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice =7;
        System.out.println("*********************");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.WithDraw");
        System.out.println("4.Interest Rate");
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

                case 4:
                    ob.Interest();
                    break;

                default:
                    System.out.println("Enter Valid input");

            }
        }
        System.out.println("Thank You!!");
    }
}
