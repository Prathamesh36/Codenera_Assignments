package NOV29.PracticeSession.ArrayList;

import java.util.ArrayList;

public class ReverseElmtInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ArrayList<Integer> ob1= new ArrayList<Integer>();
        ob.add(45);
        ob.add(67);
        ob.add(89);
        ob.add(34);
        ob.add(12);
        System.out.print(ob);
        for (int i = ob.size()-1; i >=0 ; i--) {
            ob1.add(ob.get(i));
        }
        System.out.println();
        System.out.print("Reverse: "+ob1);



    }
}
