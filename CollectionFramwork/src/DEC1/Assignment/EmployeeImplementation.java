package DEC1.Assignment;

import java.util.TreeSet;
import java.util.Comparator;

public class EmployeeImplementation {

    public static void main(String[] args) {

        TreeSet<Employee> ob=new TreeSet<>(Comparator.comparing(Employee::getName));
        ob.add(new Employee(206, "Prathamesh", 23));
        ob.add(new Employee(201, "Vishal", 25));
        ob.add(new Employee(210, "Jitesh", 27));
        ob.add(new Employee(207, "Mayank", 20));
        System.out.println("Employee data: "+ob);
    }

}