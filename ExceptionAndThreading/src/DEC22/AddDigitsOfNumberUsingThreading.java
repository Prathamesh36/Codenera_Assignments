package DEC22;


import java.util.Scanner;

class sum1 extends Thread{
    public void run(){

        int sum =0;
        for (int i = 0; i < 3; i++) {
            int rem = AddDigitsOfNumberUsingThreading.a%10;
            sum = sum+rem;
            AddDigitsOfNumberUsingThreading.a=AddDigitsOfNumberUsingThreading.a/10;
        }
        AddDigitsOfNumberUsingThreading.b[0]=sum;
    }
}
class sum2 extends Thread{
    public void run(){

        int sum =0;
        for (int i = 0; i < 3; i++) {
            int rem = AddDigitsOfNumberUsingThreading.a%10;
            sum = sum+rem;
            AddDigitsOfNumberUsingThreading.a=AddDigitsOfNumberUsingThreading.a/10;
        }
        AddDigitsOfNumberUsingThreading.b[1]=sum;
    }
}
class sum3 extends Thread{
    public void run(){

        int sum =0;
        for (int i = 0; i < 3; i++) {
            int rem = AddDigitsOfNumberUsingThreading.a%10;
            sum = sum+rem;
            AddDigitsOfNumberUsingThreading.a=AddDigitsOfNumberUsingThreading.a/10;
        }
        AddDigitsOfNumberUsingThreading.b[2]=sum;

    }
}
public class AddDigitsOfNumberUsingThreading {
    static int a =123456789;
    static int b [] = new int[3];

    public static void main(String[] args) {
        System.out.println("Number: "+a);
        sum1 ob1 =new sum1();
        sum2 ob2 =new sum2();
        sum3 ob3 =new sum3();

        try{
            ob1.start();
            ob1.join();
            ob2.start();
            ob2.join();
            ob3.start();
            ob3.join();
        }
        catch(Exception e){
            System.out.print(e);
        }
        int sum=0;

        System.out.print("Sum is: "+sum);
    }
}
