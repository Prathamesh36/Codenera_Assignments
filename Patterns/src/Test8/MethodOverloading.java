/*5.Write a Java program that demonstrates method overloading by
defining multiple methods with the same name but different parameters.*/
package Test8;
public class MethodOverloading{

    void showA(int a,int b){
        System.out.println(a+b);
    }

    void showA(String name){
        System.out.println(name);
    }
    void showA(double num, double num1){
        System.out.println(num-num1);
    }

    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
        ob.showA(5,4);
        ob.showA("Naman");
        ob.showA(4.5,3.3);

    }
}
/***********************OUTPUT*************************
 9
 Naman
 1.2000000000000002
 *****************************************************/