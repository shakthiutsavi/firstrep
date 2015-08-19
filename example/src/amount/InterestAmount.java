package amount;
import java.util.Scanner;
public class InterestAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("The amount to be deposited=" );
		int a=sc.nextInt();
		System.out.print("Yearly interest rate=" );
		float rate=sc.nextFloat();
		System.out.print("Tax rate=");
		float tax=sc.nextFloat();
		float damt=a-(a*tax/100);
		float intamt=(damt*rate/100);
		System.out.println("The interest amount= " + intamt);
		

	}

}
