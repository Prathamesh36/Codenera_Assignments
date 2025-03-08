package PracticeArtiset.LambdaAndStreams.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ram", 34));
        people.add(new Person("Chandu", 23));
        people.add(new Person("Lokesh", 29));
        people.add(new Person("Satish", 30));
        people.add(new Person("Yash", 21));

        /*System.out.println(people);
        Collections.sort(people,new name_Sorting());
        System.out.println("************Name Sorting***********");
        System.out.println(people);
        Collections.sort(people,new age_Sorting());
        System.out.println("************Age Sorting*********");
        System.out.println(people);*/
        people.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
