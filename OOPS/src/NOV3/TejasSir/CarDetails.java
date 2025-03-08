/*Write a Java program to create a class called Car with private instance variables company_name,
model_name, year, and mileage. Provide public getter and setter methods to access and modify the
company_name, model_name, and year variables. However, only provide a getter method for the
mileage variable.*/
package NOV3.TejasSir;

import java.util.Scanner;

class Car{
    private String Company;
    private String Model;
    private int Year;
    private int mil=10;
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


public class CarDetails {

    public static void main(String[] args){
        int k=1;
        while(k<3){
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
            k++;
        }
    }
}
