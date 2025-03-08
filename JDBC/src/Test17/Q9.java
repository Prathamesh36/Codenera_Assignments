/*9.	Design a multithreaded program that calculates the factorial of a number using multiple threads.
Ensure proper synchronization.*/
package Test17;

import java.util.Scanner;
class t1 extends Thread{
    @Override
    public void run() {
        super.run();
        synchronized (this) {
            while (Q9.i< Q9.num/2) {
                Q9.fact*=Q9.i;
                Q9.i++;
            }
        }
    }
}
class t2 extends Thread{
    @Override
    public void run() {

        super.run();
        synchronized (this) {
            while (Q9.i<= Q9.num) {
                Q9.fact*=Q9.i;
                Q9.i++;
            }
        }
    }
}
public class Q9 {
    static int fact=1, num,i=1;
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        num=sc1.nextInt();
        t1 em1=new t1();
        t2 em2=new t2();
        try {
            em1.start();
            em1.join();
            em2.start();
            em2.join();
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println("Factorial of a given number: "+fact);
    }

}