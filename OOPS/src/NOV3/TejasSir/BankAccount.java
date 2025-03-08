/*"Please create a Java class called BankAccount with specific attributes and conditions.
This code should be implemented using encapsulation, ensuring that the internal state of the object
is hidden and can only be accessed and modified through getter and setter methods. The class should
have the following attributes:

1. *Account Number*: A unique identifier assigned to each bank account.
2. *Account Holder's Name*: The full name of the account holder, limited to a maximum of 30 characters.
3. *Account Balance*: The current balance in the account, which must be a non-negative double value.
4. *Account Type*: Indicates the type of the account, which must be one of "Savings" or "Checking."

The code should include the necessary getter and setter methods for each attribute, validation checks to enforce the
specified constraints, and a constructor to initialize the object's state. Additionally, provide a main method
 to demonstrate the us*/
package NOV3.TejasSir;

import java.util.Scanner;

class Account{
    private int Number;
    private String Name;
    private double Balance;
    private String Type;

    Account(int Number,String Name,double Balance,String Type){
        setNumber(Number);
        setName(Name);
        setBalance(Balance);
        setType(Type);
    }
    public void setNumber(int Number){

        this.Number=Number;
    }
    public int getNumber(){
        return Number;
    }
    public void setName(String Name){
        if(Name.length()<=30) {
            this.Name = Name;
        }
        else {
            this.Name="Character limit 30 characters only";
        }
    }
    public String getName(){
        return Name;
    }
    public void setBalance(double balance){
        if(balance>=0) {
            this.Balance = balance;
        }
        else{

        }
    }
    public double getBalance(){
        return Balance;
    }
    public void setType(String Type){
        if(Type.equals("Saving")||Type.equals("Current")) this.Type=Type;
        else System.out.print("Invalid Account Type");
    }
    public String getType(){
        return Type;
    }
}


public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=1;
        while (k < 3) {
        System.out.print("Enter Account Number: ");
        int n = sc.nextInt();
        System.out.print("Enter Your Name: ");
        String name= sc.next();
        System.out.print("Enter your balance: ");
        double bal = sc.nextDouble();
        System.out.print("Enter Account Type: ");
        String type = sc.next();
        Account ac = new Account(n,name,bal,type);
        ac.setNumber(n);
        ac.setName(name);
        ac.setBalance(bal);
        ac.setType(type);
        System.out.println("*********Account Details***********");
        System.out.println("Account Number: "+ac.getNumber());
        System.out.println("Account Holder Name: "+ac.getName());
        System.out.println("Account Balance: "+ac.getBalance());
        System.out.println("Account Type: "+ac.getType());
        System.out.println("***********************************");
        k++;
        }



    }
}
