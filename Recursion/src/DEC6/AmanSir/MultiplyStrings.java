/*8) Multiply Large Numbers represented as Strings

Input : String num1 = 4154
        String num2 = 51454
Output : 213739916

Input : String num1 = 654154154151454545415415454
        String num2 = 63516561563156316545145146514654
Output : 41549622603955309777243716069997997007620439937711509062916*/
package DEC6.AmanSir;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "4154";
        String num2 = "51454";
        System.out.println("String1: "+num1);
        System.out.println("String2: "+num2);
        int a = Integer.parseInt(num1);
        int b =Integer.parseInt(num2);
        String mul =Integer.toString(a*b);
        System.out.println("OUTPUT: "+mul);

    }
}
