package JAN6.DeepCopyAndShallowCopyExample;

public class calling_calling {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address address = new Address("Delhi","Delhi",1234);
        Employee emp1 = new Employee(121,"Amit","TCS");
        Employee emp2 = (Employee)emp1.clone();
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
