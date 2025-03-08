package NOV10;

public class ExceptionHandlingFinallyBlock {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Invalid Input.......");
        }
        finally {
            System.out.println("Finally Block...");
        }
    }
}
