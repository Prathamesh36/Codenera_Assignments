package DEC5.PracticeSession;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Convert_PQ_To_AL {
    public static void main(String[] args) {
        PriorityQueue<Integer> ob = new PriorityQueue<>();
        ob.add(45);
        ob.add(81);
        ob.add(13);
        ob.add(29);
        ob.add(94);
        System.out.println("Queue1: "+ob);
        ArrayList<Integer> ob1 = new ArrayList<>(ob);
        System.out.println("ArrayList: "+ob1);
    }
}
