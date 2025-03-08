package DEC8.AmanSir.PracticeCodes.EmployeeInfo;

import java.util.Comparator;

public class IdSorting implements Comparator<EmployeeInfo> {
    @Override
    public int compare(EmployeeInfo o1, EmployeeInfo o2) {
        return o1.getId()-o2.getId();
    }
}
