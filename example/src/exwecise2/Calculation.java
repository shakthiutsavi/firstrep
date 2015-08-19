package exwecise2;
import java.util.Scanner;
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Addition = " + (x+y));
		System.out.println("Subtraction = " + (x-y));
		System.out.println("Multipliction = " + (x*y));
		System.out.println("Division = " + (x/y));
		
		

	}

}
