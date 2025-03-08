/*Make a Student class Comparable based on their GPA.*/
package JAN3.Que4;

public class Student implements Comparable<Student>{
    private String name;
    private int CGPA;

    public Student(String name, int CGPA) {
        this.name = name;
        this.CGPA = CGPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCGPA() {
        return CGPA;
    }

    public void setCGPA(int CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "\n{" +
                "name='" + name + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.CGPA-o.CGPA;
    }
}
