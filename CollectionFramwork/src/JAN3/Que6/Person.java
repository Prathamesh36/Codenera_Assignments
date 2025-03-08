package JAN3.Que6;

public class Person implements Comparable<Person>{
    private String name;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "\n{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        return this.height-o.height;
    }
}
