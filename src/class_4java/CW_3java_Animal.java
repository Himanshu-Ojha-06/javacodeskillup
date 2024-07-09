package class_4java;
//parent class (will be used for overridding)
public class CW_3java_Animal {
 public void move() {
	System.out.println("Animal is moving");
	}
}
 class parrot extends CW_3java_Animal {
	public void move() {
		System.out.println("parrot is flying");
		}
}
 class fish extends CW_3java_Animal {
	 public void move() {
		 System.out.println("fish is swimming ");
	 }
 }
 class cow extends CW_3java_Animal{
	 public void move() {
		 System.out.println("cow is walking");
	 }
 }