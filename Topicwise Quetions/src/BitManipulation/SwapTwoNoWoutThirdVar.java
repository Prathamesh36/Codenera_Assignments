package BitManipulation;

public class SwapTwoNoWoutThirdVar {
    public static void main(String[] args) {
        int a =5;
        int b =7;
        a=a^b;
        b=a^b; // = (a^b)^b = a  //(tip: b^b=0)
        a=a^b; // = (a^b)^a = b
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
