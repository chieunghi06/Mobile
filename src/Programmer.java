

public class Programmer extends Employee {
	String language;
	
	public Programmer(String name, String language , Integer aPayRollNumer ,Integer aMonthlySalary ){
		
		super(aPayRollNumer, name , aMonthlySalary );
		this.language=language;
		
	}
	
	public void display(){
		System.out.println(super.getName() + " - lập trình viên " + this.language);
	}
	

	
	
	
}

