package exercise6;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		float num=sc.nextFloat();
		if((num%2)==0){
			System.out.println("The number is even");
		}else
			System.out.println("The number is odd");

			

	}

}
