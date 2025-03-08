/*Q.3 Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/
package Test12;

import java.util.ArrayList;
import java.util.List;

public class FindNumbersStartingWith1UsingStream {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(154);
        ob.add(523);
        ob.add(96);
        ob.add(111);
        ob.add(83);
        ob.add(18);
        System.out.println("List: "+ob);

        List<Integer> ob1 = ob.stream().filter(i->String.valueOf(i).startsWith("1")).toList();
        System.out.println("Number Starting with 1 is: "+ob1);
    }
}
/*************************OUTPUT****************************
 List: [154, 523, 96, 111, 83, 18]
 Number Starting with 1 is: [154, 111, 18]
 ************************************************************/