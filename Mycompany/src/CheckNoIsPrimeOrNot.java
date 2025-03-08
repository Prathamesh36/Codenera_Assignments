import java.util.Scanner;

class CheckNoIsPrimeOrNot{


    public static void main(String[] srgs){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int n = sc.nextInt();

        int count =0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count == 0){
            System.out.println("Number is Prime Number");
        }
        else{
            System.out.println("Number is not a Prime Number");
        }
    }
}