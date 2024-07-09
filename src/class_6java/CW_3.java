//program to write in a file with FileOutputStream class object
package class_6java;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class CW_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		FileOutputStream fout = new FileOutputStream("C:\\Java and Selenium\\CW_6_3.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = " Welcome to the Unwelcoming Envinornment ";
		//convert String into Byte array
		byte b[] = s.getBytes();
	    bout.write(b);
		bout.close();
		System.out.println("file was written successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		}
	}


