package class_3java;

class Salary{
	//instance variable
	int salary;
	
	Salary(String deg){
		salary = 35;
		System.out.println("You will get Default Salary"+salary);
		System.out.println(deg);
	}
	Salary(String deg,int yearsofexp){
		salary=35*yearsofexp;
		System.out.println("you will get salary based on deg and no of experience"+salary);
		System.out.println(deg+"  "+yearsofexp);
	}
	Salary(String deg,int yearsofexp,String Technology){
		salary=35*yearsofexp+10;
		System.out.println("you will get salary based on deg and no of experience and Technology"+salary);
		System.out.println(deg+"  "+yearsofexp+"  "+Technology);
	}
}

public class CW_1 {

	public static void main(String[] args) {
		//invoking parameterized constructor
		Salary ramesh = new Salary("BE");
		Salary raja = new Salary("BE",2);
		Salary him= new Salary("BE",2,"TESTING");
	}

}
