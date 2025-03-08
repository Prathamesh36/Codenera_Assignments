package NOV28.AmanSir.StudentInfo;


class employee implements Comparable<employee>{

    private int id;
    private String name;
    private String city;
    private int salary;
    private int age;

    public int compareTo(employee o)
    {
        return this.id-o.id;
      //  return this.name.compareTo(o.name);
    }


    public employee(int id, String name, String city, int salary, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
