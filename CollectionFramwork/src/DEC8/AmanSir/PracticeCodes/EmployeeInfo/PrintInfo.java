package DEC8.AmanSir.PracticeCodes.EmployeeInfo;

import java.util.ArrayList;
import java.util.Collections;

public class PrintInfo {
    public static void main(String[] args) {
        ArrayList<EmployeeInfo> ob = new ArrayList<>();
        ob.add(new EmployeeInfo(12,"Prathamesh","pune",450));
        ob.add(new EmployeeInfo(18,"Vivek","Lahor",400));
        ob.add(new EmployeeInfo(39,"Satish","Mumbai",350));
        ob.add(new EmployeeInfo(11,"Rohan","Nashik",480));
        ob.add(new EmployeeInfo(9,"Mohan","Nagpur",410));
        System.out.println(ob);
      //  Collections.sort(ob); //Comparable
        Collections.sort(ob,new IdSorting()); //Comparator
        Collections.sort(ob,new NameSorting());
        System.out.println(ob);
        //List<EmployeeInfo> li = ob.stream().sorted(Comparator.comparing(EmployeeInfo::getSalary)).limit(3).toList();
        //System.out.println("Top 3 lowest salaries: "+li);

    }
}
