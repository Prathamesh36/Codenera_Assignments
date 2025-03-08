package NOV21.AmanSir;

public class sleepMethod {
    public void  disp(){
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        sleepMethod sb = new sleepMethod();
        sb.disp();
    }
}
