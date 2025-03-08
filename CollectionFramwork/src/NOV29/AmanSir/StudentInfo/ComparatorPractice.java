package NOV29.AmanSir.StudentInfo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorPractice {

    public static void main(String[] args) {
        ArrayList<Student_Info> ob = new ArrayList<Student_Info>();

        ob.add(new Student_Info(12,"Prathamesh","pune",450,24));
        ob.add(new Student_Info(18,"Vivek","Lahor",400,23));
        ob.add(new Student_Info(39,"Satish","Mumbai",350,21));
        ob.add(new Student_Info(11,"Rohan","Nashik",480,25));
        ob.add(new Student_Info(9,"Mohan","Nagpur",410,20));
        System.out.println(ob);
        Collections.sort(ob,new id_Sorting());
        System.out.print("************Id Sorting***********");
        System.out.println(ob);
        Collections.sort(ob,new name_Sorting());
        System.out.print("************Name Sorting*********");
        System.out.println(ob);
    }
}
