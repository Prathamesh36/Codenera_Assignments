package DEC5.PracticeSession;

import java.util.PriorityQueue;

public class AddElementsToAnotherQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> ob = new PriorityQueue<>();
        ob.add(5);
        ob.add(8);
        ob.add(3);
        ob.add(2);
        ob.add(9);
        System.out.println("Queue1: "+ob);
        PriorityQueue<Integer> ob1 = new PriorityQueue<>(ob);
        System.out.println("Queue2: "+ob1);
    }
}
