package DEC8.PracticeSession;

public class ReverseIntegerUsingRecursion {

    static int rev(int b,int a){
        if (b == 0) {
            return a;
        }
        a = (a * 10) +b % 10;
        return rev(b / 10, a);
    }
    public static void main(String[] args) {
        int number = 12345;
        int reversed = rev(number, 0);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }
}
