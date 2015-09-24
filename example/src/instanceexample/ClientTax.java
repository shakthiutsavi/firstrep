package instanceexample;
import instanceexample.Tax;

public class ClientTax {

	public static void main(String[] args) {
		Tax tx = new Tax(30000,"GA",2);
		Tax t2 = new Tax(15000,"tx",4);
		System.out.println("GrossIncome " + tx.getGrossIncome() + "State " + tx.getState() + " Dependents" + tx.getDependents());
		tx.calcTax();
		System.out.println("GrossIncome " + t2.getGrossIncome() + "State " + t2.getState() + " Dependents" + t2.getDependents());
		t2.calcTax();
		//tx.calcTax(30000,"GA",2);
		//tx.calcTax(15000, "TX", 3);
		
		
	}

	

}
