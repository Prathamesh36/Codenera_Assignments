package DEC7;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllEvenOddNoInList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(5);
        ob.add(7);
        ob.add(1);
        ob.add(9);
        ob.add(8);
        System.out.println("List: "+ob);
        int SumofEven = ob.stream().filter(i->i%2==0).mapToInt(i->i).sum();
        System.out.println("Sum of even numbers: "+SumofEven);
        int SumOdOdd = ob.stream().filter(i->i%2==1).mapToInt(i->i).sum();
        System.out.println("Sum of odd numbers: "+SumOdOdd);

    }
}
