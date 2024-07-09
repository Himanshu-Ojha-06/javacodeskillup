package class_5java;
//an Abstract class method declaration also needs to be implemented in a separate class method defination just like interace

    abstract class Company{
    	int a = 5;
    	final int b = 45;
    	public abstract void typeofProduct();//abstract method --->Hidden
    	
    	public void Product()//implementation is here so there is no abstraction = no hidden 
    	{
    		System.out.println("we are product based company");    	
    	}
    }
    	
    	class SoftwareCompany extends Company
    	{   //override
    		public void typeofProduct()
    		{
    			System.out.println("we sell software products"); 
    		}
    	}
    	
    	class AutomobileCompany extends Company
    	{   //override
    		public void typeofProduct()
    		{
    			System.out.println("we sell Automobile"); 
    		}	
    	}
    	
    	public class CW_3AbstractClass 
    	{
    
	public static void main(String[] args) {
		Company c = new SoftwareCompany();
		c.Product();
        c.typeofProduct();
		Company c1 = new AutomobileCompany();
		c1.Product();
		c1.typeofProduct();
	}
    	
}
