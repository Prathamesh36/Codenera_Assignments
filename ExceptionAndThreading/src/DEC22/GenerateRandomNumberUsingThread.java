package DEC22;

import java.util.Random;

class randomm extends Thread{
    static int j =0;
    public void run(){
        Random rn = new Random();
        j = rn.nextInt(100);
        System.out.println("Random Number is: "+j);

    }
}
public class GenerateRandomNumberUsingThread extends Thread{

    public static void main(String[] args) throws InterruptedException {
        randomm ob = new randomm();
        GenerateRandomNumberUsingThread ob1 = new GenerateRandomNumberUsingThread();
        ob.start();
        ob.join();
        ob1.start();
        Random rn = new Random();
        int x = rn.nextInt(100);
        System.out.print("Random Number is: "+x);

    }
}
