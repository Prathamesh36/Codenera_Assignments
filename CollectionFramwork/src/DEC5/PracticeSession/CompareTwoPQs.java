package DEC5.PracticeSession;

import java.util.PriorityQueue;

public class CompareTwoPQs {
    public static void main(String[] args) {
        PriorityQueue<Integer> ob = new PriorityQueue<>();
        ob.add(5);
        ob.add(8);
        ob.add(3);
        ob.add(2);
        ob.add(9);
        System.out.println("Queue1: "+ob);
        PriorityQueue<Integer> ob1 = new PriorityQueue<>();
        ob1.add(5);
        ob1.add(8);
        ob1.add(3);
        ob1.add(2);
        ob1.add(9);
        System.out.println("Queue2: "+ob1);
        int c=0;
        for (Integer el:ob1) {
            if(!ob1.contains(ob)){
                c++;
            }
        }
        if(c==0){
            System.out.print("Both Priority Queues are Same");
        }
        else{
            System.out.print("Both Priority Queues are Same");
        }
    }
}
