package class_2java;

import java.util.Scanner;

public class HW_2 {

	public static void main(String[] args) {
		int v ;
		System.out.println("No of entries");
		Scanner sc = new Scanner(System.in);
		v=sc.nextInt();
		//array of object statement1
		CognizantEmployeeDetails Emp[] = new CognizantEmployeeDetails[v];
		System.out.println("Enter Employee ID,Name,Location");
		
		Scanner s = new Scanner(System.in);
		
		for(int i =0;i<Emp.length;i++) {
			
			System.out.println("Enter "+i+ "th Employee details ");
			//array of object statement 2
			Emp[i]=new CognizantEmployeeDetails();
			
			Emp[i].empid = s.nextInt();
			Emp[i].name = s.next();
			Emp[i].Location = s.next();
			Emp[i].DisplayData();
		}
		System.out.println("Details of the empolyee are ");
		for(CognizantEmployeeDetails x : Emp) {
			
			System.out.print(x.empid+" ");
			System.out.print(x.name+" ");
			System.out.print(x.Location+" ");
			System.out.println();
			
		}
	}

}
