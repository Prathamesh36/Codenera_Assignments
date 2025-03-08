import java.util.Scanner;

class CheckNoIsPalindromeOrNot{


    public static void main(String[] srgs){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = sc.nextInt();

        int rev=0;
        int rem;
        for(int i=n;i!=0;i=i/10)
        {
            rem=i%10;
            rev=(rev*10)+rem;
        }
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

}