/*Q4.Create a HashSet of integers and write a program to remove all even numbers from the set.*/
package Test13;

import java.util.HashSet;
import java.util.Iterator;

public class removeEvenNumbersFromHashSets {
    public static void main(String[] args) {
        HashSet<Integer> ob = new HashSet<>();
        ob.add(4);
        ob.add(5);
        ob.add(3);
        ob.add(2);
        ob.add(1);
        ob.add(9);
        System.out.println("Original HashSet: " + ob);
        Iterator<Integer> it = ob.iterator();
        while (it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }
        System.out.println("After removing Even Numbers: "+ob);
    }
}
/*************************OUTPUT**************************
 Original HashSet: [1, 2, 3, 4, 5, 9]
 After removing Even Numbers: [1, 3, 5, 9]
 *********************************************************/