package NOV28.AmanSir.StudentInfo;

import java.util.ArrayList;

public class employeeImplemented {
    public static void main(String[] args) {
        ArrayList<employee>ob = new ArrayList<employee>();

        ob.add(new employee(12, "Amit", "Delhi", 12000, 22));
        ob.add(new employee(43, "Raghav", "pune", 12800, 25));
        ob.add(new employee(121, "Sumit", "Nashik", 20000, 19));
        ob.add(new employee(15, "Himanshu", "Nagpur", 11000, 20));
        ob.add(new employee(17, "Vijay", "Mumbai", 42000, 28));

        System.out.println("Without Sort");
        System.out.println(ob);

        System.out.println("after sort");
        System.out.println(ob);
    }
}
