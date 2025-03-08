/*
10) Implement a program that takes a list of numbers as input and finds the
largest prime number. Then, find the sum of its digits.
*/
package JAN29;

import java.util.ArrayList;


public class Q10_FindPrimeNumberFromListAndSumTheDigits {

    public static boolean isPrime(int n){
        int count=0;
        for (int i = 2; i <n; i++) {
            if(n%i==0) count++;
        }
        if (count==0) return true;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(13);
        al.add(11);
        al.add(7);
        al.add(4);
        al.add(8);
        System.out.println("List: "+al);
        int max=0;
        for (Integer a : al){
            if(isPrime(a) && a>max){
                max=a;
            }
        }
        System.out.println("Max prime number is: "+max);
        int sum=0;
        for (int i = max; i!=0 ; i=i/10) {
            int rem = i%10;
            sum+=rem;
        }
        System.out.println("");


    }
}

