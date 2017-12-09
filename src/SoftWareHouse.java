import java.util.ArrayList;
import java.util.List;

public class SoftWareHouse {
	
	private String name  ; 
	
	
	public SoftWareHouse (String name )
	{
		 this.name = name ; 
		 Staff  = new ArrayList  ();	 
	}
	
	
	private  ArrayList  < Employee  > Staff   ;
	
	
	public void addEmployeeforStaff (Employee emloy ) {
		
		
	     
			Staff.add( emloy );
	  
	
		
		
		
	
	}
	
	public void DisplayStaff  ()  {
		 
		
		for ( int i=0 ; i < Staff . size()  ; i++ ) {
			
			Staff . get(i ) . Display(); 
		}
		
	}
	
		public String  GetName   ()  {
		 
		
		return this. name ; 
		
	}
	

}
