/*8. Write a program that uses threads to calculate the Fibonacci sequence.
Each thread should calculate a portion of the sequence, and then the main thread should combine
the results to get the full sequence.*/
package Assignment26;
class t1 extends Thread{
    @Override
    public void run() {
        super.run();
        FiboSeriesUsingThread.a[1]=FiboSeriesUsingThread.n2;
        for (int i = 2; i < FiboSeriesUsingThread.n/2; i++) {
            FiboSeriesUsingThread.n3=FiboSeriesUsingThread.n1+FiboSeriesUsingThread.n2;
            FiboSeriesUsingThread.a[FiboSeriesUsingThread.x++]=FiboSeriesUsingThread.n3;
            FiboSeriesUsingThread.n1=FiboSeriesUsingThread.n2;
            FiboSeriesUsingThread.n2=FiboSeriesUsingThread.n3;
        }
    }
}
class t2 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = FiboSeriesUsingThread.n/2; i <FiboSeriesUsingThread.n; i++) {
            FiboSeriesUsingThread.n3=FiboSeriesUsingThread.n1+FiboSeriesUsingThread.n2;
            FiboSeriesUsingThread.a[FiboSeriesUsingThread.x++]=FiboSeriesUsingThread.n3;
            FiboSeriesUsingThread.n1=FiboSeriesUsingThread.n2;
            FiboSeriesUsingThread.n2=FiboSeriesUsingThread.n3;
        }
    }
}
public class FiboSeriesUsingThread {
    static int n1=0;
    static int n2=1;
    static int n=10;
    static int n3;
    static int x=2;
    static int a[]=new int[n];
    public static void main(String[] args) {
        t1 obT1=new t1();
        obT1.start();
        try {
            obT1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2 obT2=new t2();
        obT2.start();
        try {
            obT2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Fibonacci series: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
/**************************OUTPUT******************************
 Fibonacci series:
 0 1 1 2 3 5 8 13 21 34
 *************************************************************/