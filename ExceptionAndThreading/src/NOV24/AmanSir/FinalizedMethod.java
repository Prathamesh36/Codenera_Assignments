package NOV24.AmanSir;

public class FinalizedMethod {
    public void finalize(){
        System.out.println("Object is Deleted");
    }

    public static void main(String[] args) {
        FinalizedMethod ob = new FinalizedMethod();
        FinalizedMethod ob1 = new FinalizedMethod();

        ob=null;
        ob1=null;
        System.gc();
    }
}
