/*8) Write a program that takes a sentence as input and counts the number of words.
 If the count is prime, print "Prime number of words"; otherwise,
  print "Not a prime number of words."
*/
package JAN29;

import java.util.Scanner;

public class Q8_CountNumberOfWordsAndCheckCountIsPrimeOrNot {

    public static boolean isPrime(int n){
        int count=0;
        for (int i = 2; i <n; i++) {
            if(n%i==0) count++;
        }
        if (count==0) return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        int count=0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        if(isPrime(count)){
            System.out.println("Prime number of words");
        }
        else {
            System.out.println("Not a prime number of words.");
        }

    }
}
