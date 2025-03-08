/*1. Write a program that creates two threads, one of which counts up to 100 and the other counts down
from 100. Print out the values each thread counts to.

*/
package NOV23.AmanSir;

class CountFrom100 extends Thread{
    public void run(){
        System.out.println("Count down from 100 ");
        for(int i=100;i>=1;i--){

            System.out.print(i+" ");
        }
    }
}
class CountTo100 extends Thread{
    public void run(){
        System.out.println();
        System.out.println("Count up to 100 ");
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }
    }
}

public class Count100FromToUsingMultiThreading {
    public static void main(String[] args) {
        CountFrom100 ob = new CountFrom100();
        CountTo100 ob1 = new CountTo100();
        try{
            ob.start();
            ob.join();
            ob1.start();
        }
        catch(Exception e){
            System.out.print(e);
        }

    }
}
