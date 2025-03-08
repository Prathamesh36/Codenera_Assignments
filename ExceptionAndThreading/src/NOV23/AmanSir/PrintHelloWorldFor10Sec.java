package NOV23.AmanSir;

public class PrintHelloWorldFor10Sec extends Thread {

    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println("Hello World!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        PrintHelloWorldFor10Sec ob = new PrintHelloWorldFor10Sec();
        ob.start();
    }
}
