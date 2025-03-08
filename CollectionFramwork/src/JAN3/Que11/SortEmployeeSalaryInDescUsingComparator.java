package JAN3.Que11;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeSalaryInDescUsingComparator {
    public static void main(String[] args) {
        ArrayList<Employee> ob = new ArrayList<>();

        ob.add(new Employee("Prathamesh",25000));
        ob.add(new Employee("Mohak",30000));
        ob.add(new Employee("Satish",15000));
        ob.add(new Employee("Jitesh",10000));
        System.out.println(ob);
        System.out.println("Sorting data by their salary: ");
        Collections.sort(ob,new sortingBasedOnSalary());
        System.out.println(ob);


    }
}
