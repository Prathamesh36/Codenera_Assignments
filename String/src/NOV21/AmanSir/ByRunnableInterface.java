package NOV21.AmanSir;

public class ByRunnableInterface implements Runnable{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ByRunnableInterface t2 = new ByRunnableInterface();
        Thread t1 = new Thread(t2);
        t1.start();
    }
}
