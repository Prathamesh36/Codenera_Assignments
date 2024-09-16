/*7)method overloading concept using take parameter  in method
and convert into string and display on screen.*/
package PracticeAssignmentDEC15;

public class MethodOverLoadingConcept {
    public static void disp(int a){
        System.out.println("String 1: "+String.valueOf(a));
    }
    public static void disp(double b){
        System.out.println("String 1: "+String.valueOf(b));
    }


    public static void main(String[] args) {
        disp(4);
        disp(9.5);
    }
}
