package Test13;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedListUsingRecursion {

    public static LinkedList<Integer> ob1 = new LinkedList<>();

   /* public static List Reverse(LinkedList<Integer> ob){

        ob.removeLast();
        Reverse(ob);


    }*/

    public static void main(String[] args) {
        LinkedList<Integer> ob = new LinkedList<>();
        ob.add(4);
        ob.add(5);
        ob.add(3);
        ob.add(2);
        ob.add(1);
        ob.add(9);
        System.out.println("LinkedList: " + ob);
    }
}
