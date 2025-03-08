/*Write a Java program where two threads print odd and even numbers in sync.
 That means, one thread should print only the odd numbers and another thread
 should print only the even numbers. But, both threads should communicate with
 each other so that numbers should be printed in natural order.*/
package Today;

class Even extends Thread{
    private int a;

    Even(int a){
        this.a=a;
    }

    synchronized public void run() {
        for (int i = 0; i < a; i++) {
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
        notify();
    }
}
class Odd extends Thread{
    private int a;

    Odd(int a){
        this.a=a;
    }
    synchronized public void run() {
        try{
            wait();
        }
        catch (Exception e){
            System.out.println(e);
        }
        for (int i = 0; i < a; i++) {
            if (i % 2 == 1) {
                System.out.println(i+ " ");
            }

        }

    }
}

public class abcd {
    public static void main(String[] args) {
        int a = 10;
        Even ob = new Even(a);
        Odd ob1 = new Odd(a);

        ob.start();
        ob1.start();
    }
}
