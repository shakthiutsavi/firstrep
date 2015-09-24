package breakandcontinue;

public class BreakContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[]={12,20,69,45,90,89};
		int input=Integer.parseInt(args[0]);
		outer:
		{
			for(int i=0;i<ages.length;i++){
				if (ages[i]==(input)){
					System.out.println("Im in" + input);
				} break outer;
			}
		}
		
	System.out.println("not present"  + input);			
				
			}
		
		}
	
			

