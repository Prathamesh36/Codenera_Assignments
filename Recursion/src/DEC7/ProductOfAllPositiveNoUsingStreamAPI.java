package DEC7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOfAllPositiveNoUsingStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ob.add(5);
        ob.add(-8);
        ob.add(-7);
        ob.add(2);
        System.out.println("List: "+ob);
        int pro = ob.stream().mapToInt(i->i).filter(i->i>0).reduce(1,(a,b)->a*b);
        System.out.println("Square: "+pro);

    }
}
