package NOV24.AmanSir;


class input extends Thread {
    int[] a={1,2,3,4,5};
    public void run(){
        System.out.print(Thread.currentThread().getName());
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i < a.length; i++) {
            a[i]+=2;
        }
        System.out.println();
    }
}
class frequency extends input implements Runnable{
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());

        System.out.println();
        for (int i = 0; i < a.length; i++) {
            a[i]+=2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

public class MultiThreading extends frequency implements Runnable {

    public void run() {
        System.out.print(Thread.currentThread().getName());
        for (int i = 0; i < a.length; i++) {
            a[i]+=2;
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) throws InterruptedException {
        input t1 = new input();

        frequency t2 = new frequency();
        Thread td = new Thread(t2);

        MultiThreading t3 = new MultiThreading();
        Thread td1 = new Thread(t3);

        t1.start();
        t1.join();
        td.start();
        td.join();
        td1.start();
    }
}
