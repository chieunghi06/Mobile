import java.util.ArrayList;

public class ProjectLeader extends Programmer  {
	
	
   private   ArrayList < Programmer  > Pj  ; 

	public ProjectLeader(String name, String language, Integer aPayRollNumer, Integer aMonthlySalary) {
		super(name, language, aPayRollNumer, aMonthlySalary);
		Pj  = new ArrayList(); 
	}
	
	
	
	public void addProgrammer (Programmer pro ) 
	{
		
		
		Pj . add(pro ) ; 
		// System.out.println(" count  " + Pj . size ()   );
	} 
	
	public void display(){
		
		System.out.println(super.getName() + " Leader : " + this.language + " is Leader of Team "  );
		
		for (int i=0 ;i < Pj . size() ; i++ ) 
		{
			Pj. get(i ). display(); 
		}
	}

}
