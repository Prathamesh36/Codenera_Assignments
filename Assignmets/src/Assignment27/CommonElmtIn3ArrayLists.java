/*12.Find Common Elements in Three ArrayLists:*/
package Assignment27;

import java.util.ArrayList;

public class CommonElmtIn3ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(20);
        ob.add(15);
        ob.add(10);
        ob.add(30);
        ArrayList<Integer> ob1 = new ArrayList<Integer>();
        ob1.add(80);
        ob1.add(10);
        ob1.add(45);
        ob1.add(30);
        ArrayList<Integer> ob2 = new ArrayList<Integer>();
        ob2.add(30);
        ob2.add(5);
        ob2.add(10);
        ob2.add(30);
        ob.retainAll(ob1);
        ob1.retainAll(ob2);
        System.out.print("Common Elements: "+ob1);

    }
}
/**************************OUTPUT*****************************
 Common Elements: [10, 30]
 ************************************************************/