package OCT19.AmanSir;
import java.util.Scanner;
public class paraConstuctor {

    int id;
    String name;
    int age;
    String city;
    int salary;

    paraConstuctor(int id1,String name1,int age1,String city1, int salary1){
        id = id1;
        name = name1;
        age = age1;
        city = city1;
        salary = salary1;
    }

    public void disp(){
        System.out.println(id+"\t"+name+"\t"+age+"\t"+city+"\t"+salary);
    }

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee id");
        int id = sc.nextInt();
        System.out.print("Enter Employee name");
        int name = sc.nextInt();
        System.out.print("Enter Employee age");
        int age = sc.nextInt();
        System.out.print("Enter Employee city");
        int city = sc.nextInt();
        System.out.print("Enter Employee salary");
        int salary = sc.nextInt();
        paraConstuctor emp4 = new paraConstuctor(204,"Satish",26,"Agra",500000);*/
        paraConstuctor emp1 = new paraConstuctor(201,"Prathamesh",23,"pune",1400000);
        emp1.disp();
        paraConstuctor emp2 = new paraConstuctor(202,"Ganesh",21,"nashik",110000);
        emp2.disp();
        paraConstuctor emp3 = new paraConstuctor(203,"Pavan",25,"mumbai",900000);
        emp3.disp();
        paraConstuctor emp4 = new paraConstuctor(204,"Satish",26,"Agra",500000);
        emp4.disp();
        paraConstuctor emp5 = new paraConstuctor(205,"Umesh",36,"lahor",5000);
        emp5.disp();
    }
}
