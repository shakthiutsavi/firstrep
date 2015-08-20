package exercise7;
import java.util.Scanner;
public class Gradecalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Quiz Score : ");
		float score=sc.nextFloat();
		System.out.print("Mid-Term score : ");
		float midterm=sc.nextFloat();
		System.out.print("Final score : ");
		float fscore=sc.nextFloat();
		float result = (score+midterm+fscore)/3;
		if(result >=90)
		{
			System.out.print("Your grade is A");
		}
		else if((result >=70) && (result < 90) )
       {
    	   System.out.print("Your grade is B");
	}
		else if((result>=50) && (result<70)){
			System.out.print("Ypur grade is C");
		}
		else if (result<50)
		{
			System.out.print("Your grade is F");
		}
	}
}
