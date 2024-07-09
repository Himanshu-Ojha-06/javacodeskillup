package class_4java;
//polymorphism concept 
//method overridding(it is concept of polymorphism)

  class Parent //parent class or base class
  {
	void eat() {
		System.out.println("Parent is eating");
	}
}


  			//child class	 // parent class
  public class CW_2java extends Parent{
	
	void eat() {
		System.out.println("child is eating");
	}
	
	public static void main(String[] args) {
		//s <----- is child class variable, CW_2java(); <--- is the instance
		CW_2java s = new CW_2java();
		s.eat();
		Parent s1 = new Parent();
		s1.eat();
		// here the instance belongs to child so definiatly it will call child method despite parent variavle object
		Parent s2 = new CW_2java();
		s2.eat();
		//CW_2java s3 = new Parent();
		//s3.eat();
		
	}

}
