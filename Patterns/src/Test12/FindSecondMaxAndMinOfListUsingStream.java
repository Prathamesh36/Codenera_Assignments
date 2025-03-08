package Test12;

import java.util.ArrayList;

public class FindSecondMaxAndMinOfListUsingStream {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(9);
        ob.add(4);
        ob.add(5);
        ob.add(1);
        ob.add(0);
        System.out.println("LinkedList: "+ob);
     //   Integer ob1= ob.stream().sorted().skip(1).findFirst().stream().mapToInt();
     //   System.out.println(ob1);
      //  Integer ob2= ob.stream().mapToInt().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst();
     //   System.out.println(ob1);
    }
}
