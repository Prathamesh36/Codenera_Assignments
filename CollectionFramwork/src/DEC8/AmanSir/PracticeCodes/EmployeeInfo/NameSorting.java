package DEC8.AmanSir.PracticeCodes.EmployeeInfo;

import java.util.Comparator;

public class NameSorting implements Comparator<EmployeeInfo> {

    @Override
    public int compare(EmployeeInfo o1, EmployeeInfo o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
