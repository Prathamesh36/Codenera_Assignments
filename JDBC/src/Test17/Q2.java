/*2.	Implement a program that creates two threads and ensures proper synchronization using locks.*/
package Test17;

import java.util.Arrays;

class thr1 extends Thread{
    @Override
    public void run() {

        super.run();
        for (int i = 0; i < Q2.a.length/2; i++) {
            Q2.sum+=Q2.a[i];
        }
    }
}
class thr2 extends Thread{
    @Override
    public void run() {

        super.run();
        for (int i = Q2.a.length/2; i < Q2.a.length; i++) {
            Q2.sum+=Q2.a[i];
        }
    }
}
public class Q2 {
    static int a[]= {1,2,3,4,5,6,7};
    static int sum=0;
    public static void main(String[] args) {

        System.out.println(Arrays.toString(a));
        thr1 thr1=new thr1();
        thr2 thr2=new thr2();
        thr1.start();
        thr2.start();
        try {
            thr1.join();
            thr2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sum);


    }

}