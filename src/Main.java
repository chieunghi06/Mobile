
public class Main {
	
	

	public static void main(String[] args) {
		
		SoftWareHouse swh = new SoftWareHouse ("VNPT"); 
		
		
		System.out.println(" The software house is : " + swh  . GetName()   );
		
		Programmer p1 = new Programmer ("Jonny" , "C++ "   , 5 ,  2000 ) ;
		Programmer p2  = new Programmer ("Sun " , "C#  "   , 4  ,  1100 ) ;
		Programmer p3 = new Programmer ("Jonny" , "C++ "   , 5 ,  2000 ) ;
		Programmer p4  = new Programmer ("Peter " , "Android  "   , 5 ,  2000 ) ;
		Programmer p5  = new Programmer ("Math " , "C  "   , 5 ,  2000 ) ;
		
		// p1. Display(); 
		
		
		ProjectLeader prl1 = new ProjectLeader ("Lion " , "Java " , 8 , 3000 )   ; 
		ProjectLeader prl2  = new ProjectLeader ("Sofia " , "DotNet  " , 9  , 4500 )   ; 
		
		
		
		swh . addEmployeeforStaff(prl1);
		swh. addEmployeeforStaff(p1);
		swh. addEmployeeforStaff(p2 );
		swh. addEmployeeforStaff(p3 );
		swh. addEmployeeforStaff(p4  );
		swh. addEmployeeforStaff(p5  ); 
         
		System.out.println(" The software house have the number of staff is  :"   );
		swh . DisplayStaff() ; 
		
		
		
		
		
         // prl1. display(); 
		
		prl1 . addProgrammer( p1 );
		prl1 . addProgrammer( p2 );
		prl1 . addProgrammer( p3  );
		prl2  . addProgrammer( p4  );
		prl2  . addProgrammer( p5  ); 
		
		System.out.println(" And  "   );
		prl1 . display(); 
		prl2  . display();  
		
		
		
		
       
		
		
		

	}
	
	
	

}
