package class_1java;

public class Class_1_Cognizant {
	int salary;
	String Location;
	
	
	//default constructor
	Class_1_Cognizant(){
	System.out.println("i am constructor");	
	}
	
	void setLocation(String location) {
		//by this keyword we are setting the value of instance variable to  
		this.Location = location;	
	}
	
	void returnLocation()
	{
		System.out.println(Location);
	}
	
	int returnSalary(int Sal) 
	{
		int incrementSal = Sal+10000;
		return incrementSal;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_1_Cognizant calvin = new Class_1_Cognizant ();
		
		calvin.setLocation("chennai");
		calvin.returnLocation();
		int getsal = calvin.returnSalary(50000);
		
		System.out.println(calvin.Location);
		//System.out.println(calvin.salary);
		
		System.out.println(getsal);
	}

}
