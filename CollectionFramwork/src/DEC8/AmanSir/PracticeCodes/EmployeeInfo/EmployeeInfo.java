package DEC8.AmanSir.PracticeCodes.EmployeeInfo;

public class EmployeeInfo /*implements Comparable<EmployeeInfo>*/{
    private int id;
    private String name;
    private String city;
    private int salary;

    public EmployeeInfo(int id, String name, String city, int salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }

   /* @Override
    public int compareTo(EmployeeInfo o) {
        return this.id-o.id;
    }*/
}
