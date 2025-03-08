package DEC8.PracticeSession;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class ConvertPriorityQueueToArray {
    public static void main(String[] args) {
        PriorityQueue<Integer> ob = new PriorityQueue<>();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        System.out.println("PriorityQueue: "+ob);
        ArrayList<Integer> ob1=new ArrayList<>(ob);
        System.out.println("Array: "+ob1);
    }
}
