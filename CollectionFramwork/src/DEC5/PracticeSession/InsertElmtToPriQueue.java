package DEC5.PracticeSession;

import java.util.PriorityQueue;

public class InsertElmtToPriQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> ob = new PriorityQueue<>();
        ob.add(5);
        ob.add(8);
        ob.add(3);
        ob.add(2);
        ob.add(9);
        System.out.println("Queue1: "+ob);
        ob.offer(100);
        System.out.println("New Queue: "+ob);
    }
}
