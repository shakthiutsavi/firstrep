package instanceexample;

public class Tax {
    double grossIncome;
    String state;
    int dependents;	
    
	public Tax(double grossIncome,String state,int dependents){
		this.grossIncome=grossIncome;
		this.state=state;
		this.dependents=dependents;
		
	}
	
public double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(double grossIncome) {
		this.grossIncome = grossIncome;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getDependents() {
		return dependents;
	}

	public void setDependents(int dependents) {
		this.dependents = dependents;
	}

public void calcTax(){
	double stateTax;
	if(grossIncome<20000){
		stateTax=(grossIncome * 0.05);
	}else {
		stateTax=(grossIncome * 0.06);
	}
	
	//System.out.println("GrossIncome= " + grossIncome  +  " State " + state +  " Dependents " + dependents);
	System.out.println("State Tax = " + stateTax);
	
}
}



