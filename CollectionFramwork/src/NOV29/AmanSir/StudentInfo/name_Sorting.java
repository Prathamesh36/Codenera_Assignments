package NOV29.AmanSir.StudentInfo;

import java.util.Comparator;

public class name_Sorting implements Comparator<Student_Info> {

    @Override
    public int compare(Student_Info o1, Student_Info o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
