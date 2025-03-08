package JAN3.Que4;

import java.util.ArrayList;
import java.util.Collections;

public class CompareCGPAofStudentsUsingComparable {
    public static void main(String[] args) {
        ArrayList<Student> ob = new ArrayList<>();
        ob.add(new Student("Prathamesh",8));
        ob.add(new Student("Lalit",4));
        ob.add(new Student("Mohak",5));
        ob.add(new Student("Dhruv",9));
        Collections.sort(ob);
        System.out.println("Sorting based ob GPA: ");
        System.out.println(ob);

    }
}
