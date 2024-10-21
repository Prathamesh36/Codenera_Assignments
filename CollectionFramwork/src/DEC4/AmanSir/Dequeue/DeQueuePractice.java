package DEC4.AmanSir.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;


public class DeQueuePractice {
    public static void main(String[] args) {
        Deque<Integer> ob = new ArrayDeque<>();
        ob.add(56);
        ob.add(34);
        ob.add(23);
        ob.add(76);
        ob.add(12);
        System.out.println("Dequeue: "+ob);
      /*  ob.addFirst(100);
        ob.addLast(200);
        System.out.println("Add First Add Last : "+ob);
        System.out.println("Get First "+ob.getFirst());
        System.out.println("Get LAst "+ob.getLast());*/

        System.out.println("Offer first: "+ob.offerFirst(500));
        System.out.println("Offer last: "+ob.offerLast(900));
        System.out.println("Dequeue: "+ob);
        System.out.println("Peek First: "+ob.peekFirst());
        System.out.println("Peek Last: "+ob.peekLast());
        System.out.println("Dequeue: "+ob);
        System.out.println("Poll First"+ob.pollFirst());
        System.out.println("Poll Last: "+ob.pollLast());
        System.out.println("Dequeue: "+ob);
    }
}
