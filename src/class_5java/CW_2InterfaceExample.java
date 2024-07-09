package class_5java;

 interface CW_2GovtPolicy {
	public void PolicyForHomeLoan();//100% abstraction
}
interface RBI extends CW_2GovtPolicy{
	public abstract void RateOfInterest(); //100% abstraction
	
	public static int a = 10;
	//even if we don't write variables are 100% "public static final" 
	int b =23;
}
class SBI implements RBI
	{
	//implements from RBI
	@Override
	public void RateOfInterest() 
	{
		System.out.println("SBI rate of interest is 8.5");
	}
	//multilevel inheritance implements from "interface CW_2GovernmentPolicy"  
	@Override
	public void PolicyForHomeLoan() 
	{
		System.out.println("Need Adhaar,PAN etc");
	}
	}
class ICICI implements RBI
	{
	@Override
	public void RateOfInterest() 
	{
		System.out.println("ICICI rate of interest is 9");
	}
	public void PolicyForHomeLoan() 
	{
		System.out.println("Need Adhaar,Salary Statement etc");
	}
	}
class HDFC implements RBI{
	public void RateOfInterest() {
		
	}
	public void PolicyForHomeLoan() {
		
	}
}
public class CW_2InterfaceExample {
	public static void main(String args[]) {
		//interface var = new classname();
		//abstract var = new classname();
		//we cannot create object for interface so we are making instance of class to implement the interface
		
		//parent interface variable and subclass instance 
		RBI s = new SBI();
		s.RateOfInterest();
		s.PolicyForHomeLoan();
		
		//subclass variable and subclass instance 
		SBI s1 =new SBI();
		s1.RateOfInterest();
		s1.PolicyForHomeLoan();
		
		//interface variable and subclass instance 
		RBI i = new ICICI();
		i.RateOfInterest();
		i.PolicyForHomeLoan();
		
		//subclass variable and subclass instance
		ICICI i1 = new ICICI();
		i1.RateOfInterest();
		i1.PolicyForHomeLoan();
		
		
	}
}