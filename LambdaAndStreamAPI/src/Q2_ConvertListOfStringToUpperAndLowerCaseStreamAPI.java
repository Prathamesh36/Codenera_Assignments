/*2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.*/
import java.util.ArrayList;
import java.util.List;


public class Q2_ConvertListOfStringToUpperAndLowerCaseStreamAPI {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Codenera");
        al.add("Pune");
        al.add("Mumbai");
        al.add("Java");
        al.add("Python");
        al.add("React");
        System.out.println("ArrayList: "+al);
        List<String> uppercase = al.stream().map(String::toUpperCase).toList();
        List<String> lowercase = al.stream().map(String::toLowerCase).toList();
        System.out.println("Uppercase: "+uppercase);
        System.out.println("Lowercase: "+lowercase);
    }
}
/**********************************OUTPUT*******************************
 ArrayList: [Codenera, Pune, Mumbai, Java, Python, React]
 Uppercase: [CODENERA, PUNE, MUMBAI, JAVA, PYTHON, REACT]
 Lowercase: [codenera, pune, mumbai, java, python, react]
 ***********************************************************************/