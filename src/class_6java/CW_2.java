//program to read vslues or text from test file
package class_6java;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class CW_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Java and Selenium\\CW_6_2.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			//int i = fin.read();
			int i =0;
			while((i = bin.read())!=-1) {
			System.out.println(i+"value is"+(char)i);	
			}
			
			bin.close();
		}
		catch(Exception e) {
			System.out.println(e);
			}
	}

}
