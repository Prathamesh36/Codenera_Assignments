/*6. Write a program that creates a thread that calculates the factorial of a number. The main thread should wait
 the thread to finish and then print out the result.
*/
package Assignment26;

import java.util.Scanner;

public class FindFactorial extends Thread{
    int fact=1;
    static int result;
    int n;
    FindFactorial(int n){
        this.n=n;
    }

    public int factorial(int n){
        for(int i=5;i>=1;i--){
            fact *= i;
        }
        return fact;
    }

    public void run(){
        result = factorial(n);
    }


    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        FindFactorial ob = new FindFactorial(n);
        ob.start();
        ob.join();
        System.out.print("Factorial is: "+result);
    }
}
/**************************OUTPUT******************************
 Enter number: 5
 Factorial is: 120
 *************************************************************/