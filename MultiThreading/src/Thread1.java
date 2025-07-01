//class Mythread extends Thread{
//    public void run(){
//
//        System.out.println("thread 1 is running");
//    }
//}

public class Thread1 {
    public static void main(String[] args) {
        System.out.println("Hello world");

//        Thread th = new Thread();
//        th.start();

//        Mythread th = new Mythread();
//        th.start();

        Thread th1 = new Thread(() -> {
            System.out.println("thread 2 is running");
        });

        th1.start();

//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("thread 3 is running");
//            }
//        }
// -----or------------
        Runnable run = () ->{
            System.out.println("thread 3 is started");
            System.out.println(Thread.currentThread().getName());       //get name
            System.out.println(Thread.currentThread().getState());      //get state
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 3 is completed");
            System.out.println(Thread.currentThread().getState());
        };

        Thread th2 = new Thread(run, "runnable thread");
        th2.setDaemon(true);
        th2.start();
        System.out.println("main thread ended");
    }
}

