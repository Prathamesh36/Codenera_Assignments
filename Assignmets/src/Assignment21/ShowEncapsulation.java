package Assignment21;

import java.util.Scanner;

class Car{
    private String Company;
    private String Model;
    private int Year;
    private int mil=15;
    public Car(String company, String model, int year) {
        setCompany(company);
        setModel(model);
        setYear(year);
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMil() {
        return mil;
    }
}

public class ShowEncapsulation {
    public static void main(String[] args){
        int k=1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Company Name: ");
            String name = sc.next();
            System.out.print("Enter Model Name: ");
            String mname = sc.next();
            System.out.print("Enter Year: ");
            int year = sc.nextInt();
            Car ob = new Car(name, mname, year);
            System.out.println("************CAR INFO**************");
            System.out.println("Company name: " + ob.getCompany());
            System.out.println("Model name:" + ob.getModel());
            System.out.println("Year: " + ob.getYear());
            System.out.println("Mileage: " + ob.getMil());
            System.out.println("**********************************");
    }
}
/********************************************************
 Enter Company Name: Tata
 Enter Model Name: Nexon
 Enter Year: 2022
 ************CAR INFO**************
 Company name: Tata
 Model name:Nexon
 Year: 2022
 Mileage: 15
 **********************************
 ********************************************************/
