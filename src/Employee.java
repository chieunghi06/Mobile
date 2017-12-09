
public class Employee {
	private String name;
	private Integer thePayRollNumber  ; 
	private Integer theMonthlySalary ;
	
	
	
	public Employee (Integer payrollnumber , String name , Integer monthlysalary ) {
		this.thePayRollNumber = payrollnumber ;
		this.name = name ;
		this.theMonthlySalary = monthlysalary  ;
		
	}
	public String getName(){
		
		return this.name;
	}
	
	public void setPayRollNumber (Integer payrollnumber )
	{
		this.thePayRollNumber = payrollnumber ;
//		this.name = name ;
//		this.theMonthlySalary = monthlysalary  ;
		
	}
	
	public Integer  GetPayRollSalary() {
		
		return thePayRollNumber ; 
	}
	
	public Integer  GetMonthlySalary() {
		
		return theMonthlySalary ; 
	}
	public void Display () {
		
		System.out.println( " Name is             : " + this.name );
		System.out.println("  ThePayRollNumber is : " + this.thePayRollNumber );
		System.out.println( " TheMonthlySalary is : " + this. theMonthlySalary );
		
	}
	
	 
}