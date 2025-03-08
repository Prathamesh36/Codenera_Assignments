package NOV29.AmanSir.StudentInfo;

import java.util.Comparator;

public class id_Sorting implements Comparator<Student_Info> {

    @Override
    public int compare(Student_Info o1, Student_Info o2) {
        return o1.getId()- o2.getId();
    }
}
