package NOV29.AmanSir.StudentInfo;

import java.util.Comparator;

class Student_Info {
    private int id;
    private String name;
    private String city;
    private int marks;
    private int age;


    public Student_Info(int id, String name, String city, int marks, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.marks = marks;
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

    public int getMarks() {
        return marks;
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
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
