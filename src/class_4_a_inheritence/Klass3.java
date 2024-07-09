package class_4_a_inheritence;

public class Klass3  {

	public static void main(String[] args) {
		
		Klass1 s = new Klass1();
		//can access public member
		System.out.println(s.a);
		//can access protected member
		System.out.println(s.c);
		//class 1 object can access the default access specifier
		System.out.println(s.d);
		

	}

}
