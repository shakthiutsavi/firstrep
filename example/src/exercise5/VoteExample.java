package exercise5;
import java.util.Scanner;

public class VoteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the age ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		 if(age>=18) {
			 System.out.println("Eligible to vote");
		 }else if(age<18){
			 System.out.println("Not Eligible to vote");
		 }
			 
		 
		 
		
				
		

	}

}
