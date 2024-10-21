package DEC4.AmanSir.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        Queue<Integer> ob = new PriorityQueue<>();
        ob.add(56);
        ob.add(34);
        ob.add(23);
        ob.add(76);
        ob.add(12);
        System.out.println("Queue: "+ob);
        ob.offer(99);
        System.out.println("Offer: "+ob);
        ob.poll();
        System.out.println("Poll: "+ob);
        ob.remove(76);
        System.out.println("Remove: "+ob);
        ob.clear();
        System.out.println("Clear: "+ob);
        ob.peek();
        System.out.println("Peek: "+ob);
        ob.element();
        System.out.println("Remove: "+ob);

    }
}
