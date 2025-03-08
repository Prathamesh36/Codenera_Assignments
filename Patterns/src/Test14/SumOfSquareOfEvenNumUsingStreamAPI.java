/*4.Implement a method that takes a list of integers and returns the
sum of the squares of even numbers using the Stream API.*/
package Test14;

import java.util.ArrayList;
import java.util.List;


public class SumOfSquareOfEvenNumUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> ob = new ArrayList<>();
        ob.add(2);
        ob.add(5);
        ob.add(1);
        ob.add(4);
        ob.add(7);
        ob.add(8);
        System.out.println("Original List: "+ob);
        System.out.println();
        int  sum=0;
        int li= ob.stream().filter(i-> i%2==0).mapToInt(i->i).sum();


        System.out.println("Sum of even numbers: "+li);


    }
}
/***********************OUTPUT*************************
 Original List: [2, 5, 1, 4, 7, 8]
 Sum of even numbers: 14
 *******************************************************/