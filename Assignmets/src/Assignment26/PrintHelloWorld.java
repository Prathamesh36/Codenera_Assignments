/*3. Write a program that creates a thread that prints out "Hello, world!" every second for 10 seconds.*/
package Assignment26;


public class PrintHelloWorld extends Thread {

    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println("Hello World!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        PrintHelloWorld ob = new PrintHelloWorld();
        ob.start();
    }
}
/**************************OUTPUT******************************
 Hello World!!
Hello World!!
Hello World!!
Hello World!!
Hello World!!
Hello World!!
Hello World!!
Hello World!!
Hello World!!
 Hello World!!
 *************************************************************/