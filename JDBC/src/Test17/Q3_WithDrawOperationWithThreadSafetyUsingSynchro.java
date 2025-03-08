/*3.	Create a class representing a banking account with methods to deposit and withdraw money.
 Ensure that the withdrawal operation is thread-safe.*/
package Test17;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Q3_WithDrawOperationWithThreadSafetyUsingSynchro {
    public static void main(String[] args) {
        BankAccount ob = new BankAccount(50000);
        ob.deposit(10000);
        System.out.println("Balance After deposit: "+ob.getBalance());
        ob.withdraw(40000);
        System.out.println("Balance After withdraw: "+ob.getBalance());
    }
}
/***************************OUTPUT******************************
 Balance After deposit: 60000.0
 Balance After withdraw: 20000.0
 ****************************************************************/
