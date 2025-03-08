package OCT13;

import java.util.Scanner;

public class arrayMethods {

	int x,y;
	public void sum() {
		input();
		int sum = x+y;
		System.out.println("sum is: "+sum);
	}
	public void input() {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		b = sc.nextInt();
		x=a;
		y=b;
		
	}
	
	public static void main(String[] args) {
		arrayMethods ob = new arrayMethods();
		
		ob.sum();

}
}