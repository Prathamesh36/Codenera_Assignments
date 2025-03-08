package NOV23;

public class ThreadQue extends Thread{

    public void run(){
        System.out.println("Hello World!!");
    }

    public static void main(String[] args) {
        ThreadQue ob = new ThreadQue();
        ob.start();

    }
}
