package JAN3.Que11;

import java.util.Comparator;

public class sortingBasedOnSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSalary()-o1.getSalary();
    }
}
