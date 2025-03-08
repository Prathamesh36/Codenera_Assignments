/*WAP to iterate the element of array list using lambda expression.*/
package JAN30;

import java.util.ArrayList;

public class IterateArrayListUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(6);
        ob.add(5);
        ob.add(8);
        ob.add(2);
        ob.add(0);
        ob.add(3);
        System.out.println("ArrayList: "+ob);
        ob.forEach(el-> System.out.print(el+" "));


    }
}
