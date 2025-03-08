/*2. Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.*/
package NOV23;
class Even extends Thread{
    public void run(){
        System.out.println();
        System.out.println("Even no: ");
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
public class Odd extends Thread{
    public void run(){
        System.out.println("Odd no: ");
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String []args){

        Even ob1 =new Even();
        Odd ob =new Odd();
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