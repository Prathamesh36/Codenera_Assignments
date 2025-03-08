/*
4.TreeSet:
   - Create a TreeSet in Java to store custom objects (e.g., Person class with name and age fields). Ensure that the TreeSet sorts the objects first by age and then by name if the ages are equal.
*/
package PracticeArtiset.SortTreeSetBasedOnCondition;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Person person){
        int ageCompare = Integer.compare(this.age, person.age);
        if(ageCompare != 0){
            return ageCompare;
        }
        return this.name.compareTo(person.name);
    }


}
