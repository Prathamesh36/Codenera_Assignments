package NOV28.AmanSir.StudentInfo;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(7);
        //System.out.println(ob);
      //  ArrayList<Integer> ob1 = new ArrayList<Integer>();
        ob.add(8);
        ob.add(9);
        ob.add(10);
      //  ob.addAll(ob);
   /*     System.out.println(ob1);
        ArrayList<Integer> ob2 = new ArrayList<Integer>();
        ob2=(ArrayList<Integer>)ob1.clone();
        System.out.println(ob2);
        System.out.println(ob2.equals(ob1));
        System.out.println(ob2.indexOf(10));
        System.out.println(ob2.isEmpty());*/

        ob.forEach(System.out::println);

    }
}
