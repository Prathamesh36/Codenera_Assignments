package NOV10;

public class ExceptionPropagation {

    public void disp(){
        int a=1;
        int b=0;
        System.out.println(a/b);
    }
    public void disp1(){
        disp();
    }

    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
        try{
            ep.disp1();
        }catch (Exception e) {
            System.out.println("Invalid...........");
        }
    }
}
