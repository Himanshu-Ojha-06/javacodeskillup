package class_3java;

class Emp{
	//instance variable
	int ID;
	public String name,dept;
	float sal;
	
	public Emp(int ID,String name,String dept)
	{
		//reffering to instance variable with help of this keyword
		this.ID=ID;
		this.name=name;
		this.dept=dept;
	}
	Emp(int ID,String name,String dept,float sal)
	{
	this(ID,name,dept);//reusing constructor again new use of this keyword
	this.sal = sal;
	}
	public void display(){
	System.out.print(ID+" "+name+" "+dept+" "+sal);	
	}

public class CW_2 {

	public static void main(String[] args) {
		Emp bala = new Emp(21234234,"Bala","Testing");
		Emp Ankush = new Emp(345345,"Ankush","Devlopment",23423423f);
		bala.display();
		System.out.println();
		Ankush.display();

	}
}
}
