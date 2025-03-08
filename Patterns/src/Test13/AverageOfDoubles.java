/*Q15.Write a program to find the average of a list of doubles using the Stream API.*/
package Test13;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class AverageOfDoubles {
    public static void main(String[] args) {
        ArrayList<Double> ob = new ArrayList<>();
        ob.add(5.6);
        ob.add(4.5);
        ob.add(2.1);
        ob.add(7.2);
        ob.add(2.2);
        System.out.println("List: "+ob);
        OptionalDouble avg = ob.stream().mapToDouble(Double::doubleValue).average();
        System.out.println("Average of Doubles: "+avg);

    }
}
/************************OUTPUT*************************
 List: [5.6, 4.5, 2.1, 7.2, 2.2]
 Average of Doubles: OptionalDouble[4.32]
 ********************************************************/