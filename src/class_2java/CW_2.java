package class_2java;

import java.util.Scanner;

public class CW_2 {
	
	public static void main(String[] args) {
		int rec;
		System.out.println("enter the number of entries");
		Scanner r = new Scanner(System.in);
		rec = r.nextInt();

		//Array of object creation of BankCustomerDetails class
		BankCustomerDetails cus[] = new BankCustomerDetails[rec];
		//taking input through Scanner class
		Scanner s = new Scanner(System.in);
		//taking input in 
		for(int i =0;i<cus.length;i++)
		{
			System.out.println("Enter Number "+i+"th Customer Details *****************");
			//Logic behinfd line 14 and 22 BankCustomerDetails cus[0]=new BankCustomerDetails();
			cus[i] = new BankCustomerDetails();
			cus[i].name =s.next();
			cus[i].age = s.nextInt();
			
		}
		System.out.println("*********************Customer Details Display ****************************");
		for(int i=0;i< cus.length;i++) {
			System.out.print(cus[i].name+"  ");
			System.out.println(cus[i].age);
		}
		System.out.println("*********************Customer Details Display Using Inhanced for loop ****************");
		//Format ---> classname obj : objArray
		for(BankCustomerDetails x : cus) {
			
			System.out.print(x.name+"  ");
			System.out.println(x.age);
		}
	}

}
