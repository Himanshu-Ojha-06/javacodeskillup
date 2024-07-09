package class_4java;

class parent1 {
	
	void dance() {
		System.out.println("Parent Loves bharatnatyam");
	}
}

public class HW_1Child extends parent1 {
	
	void dance() {
		System.out.println("Child loves Western dance");
	}
	public static void main(String[] args) {
		HW_1Child c = new HW_1Child();
		c.dance(); 
		
		parent1 p = new parent1();
		p.dance();
		
		parent1 p1 = new HW_1Child();
		p1.dance();

	}

}
