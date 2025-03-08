package JAN6;

public class InterThreadCommunication extends Thread{
    int total_ticket=0;
    public void run(){
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                total_ticket=total_ticket+100;
            }
            this.notify();
        }
    }
    public static void main(String[] args) {
        InterThreadCommunication t1 = new InterThreadCommunication();
        t1.start();
        synchronized (t1){
            try{
                t1.wait();
                System.out.println("Total Amount:"+t1.total_ticket);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
