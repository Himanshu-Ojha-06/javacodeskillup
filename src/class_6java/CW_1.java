package class_6java;

import java.util.Scanner;

public class CW_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		System.err.println("This is Error message");
		int a =sc.nextInt();
		//we are typecasting the datatype here we converted int a to float b 
		char b = (char)a;
		System.out.println(b);
	
	}

}
