package com.constructorAssignment;
//import java.util.ArrayList;

public class PersonArray {

	public static void main(String[] args) {
		int i;
		int j;
		//String person[]=new String[4];
		Person per[][]=new Person[5][5];
		per[0][0]=new Person("Prashnath",20000);
		per[0][1]=new Person("Shakthi",15000);
		per[0][2]=new Person("Prash",30000);
		per[0][3]=new Person("Honey",40000);
		per[0][4]=new Person("Thoppu",23000);
		for(i=0;i<per.length;i++){
			for(j=0;j<per.length;j++){
				System.out.println(per[i][j].name);
			per[i][j].salary=(per[i][j].salary)+3000;
		}
		for(i=0;i<per.length;i++){
			for(j=0;j<per.length;j++){
				System.out.println(per[i][j].name +" " + per[i][j].salary);
			}
				
			}
			
		
		}
		
			/*for(int per[idx]:per){
			per[idx].salary=(per[idx].salary)+3000;
			}*/
			
		}
	}



		
		
		
		
		
		
		
		
		
		
		
 		
		
	
	

		
	

	


