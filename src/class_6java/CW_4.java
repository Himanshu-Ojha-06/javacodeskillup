package class_6java;

import java.io.FileWriter;
import java.io.IOException;

public class CW_4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String str = "hello i work at cognizant";
		FileWriter w = new FileWriter("CW_6_4.txt");
		
		for(int i =0;i<str.length();i++)
		{
			w.write(str.charAt(i));
		}
		System.out.println("file is created and written successfully");
		w.write(str,0,5);
		w.close();  
	}

}
