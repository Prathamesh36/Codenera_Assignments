package NOV22.AmanSir;

class demo {
    void table(){
        for (int i = 0; i <=10; i++) {
            System.out.println(i*4);
        }
    }
}

public class Syncronization extends Thread{
    static demo ob;

    public void run() {
        ob.table();
    }
    public static void main(String[] args) {
        ob=new demo();

    }
}
