/*Write a program that creates a thread that generates random numbers. The main thread should wait for the thread to
finish and then print out the generated numbers.*/
package Assignment26;

import java.util.Random;

public class PrintRandomNumber extends Thread{
    static int result;
    public int generateNo(){
        Random rn = new Random();
        int j=rn.nextInt();
        return j;
    }
    public void run(){
        result = generateNo();
    }


    public static void main(String[] args) throws InterruptedException {

        PrintRandomNumber ob = new PrintRandomNumber();
        ob.start();
        ob.join();
        System.out.print("Random Number is: "+result);

    }
}
/**************************OUTPUT******************************
 Random Number is: 513413933
 *************************************************************/