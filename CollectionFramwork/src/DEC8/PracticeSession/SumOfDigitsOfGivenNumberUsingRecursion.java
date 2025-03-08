package DEC8.PracticeSession;

public class SumOfDigitsOfGivenNumberUsingRecursion {

    static int sum(int a){
        if(a==0)return a;
        return  (a%10)+sum(a/10);
    }

    public static void main(String[] args) {
        int a = 12345;
        System.out.println("Digits: "+a);
        System.out.println("Sum of Digits: "+sum(a));
    }
}
