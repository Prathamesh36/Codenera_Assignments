package NOV22.PracticeSession;

public class tryCatchQue {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Invalid Input......."+e);
        }
    }
}
