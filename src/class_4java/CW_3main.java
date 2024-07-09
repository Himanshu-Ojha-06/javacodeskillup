package class_4java;
//main class will implement overriding 
public class CW_3main {

	public static void main(String[] args) {
		//declaration of animal array with the declaration by parent Animal class then making instances of the child hirerichal classes
		CW_3java_Animal animals[] = new CW_3java_Animal[4];
		//instances of child classes
		animals[0]=new parrot();
		animals[1]=new fish();
		animals[2]=new cow();
		//instance of the parent class
		animals[3]=new CW_3java_Animal();
		for (int i=0;i<animals.length;i++) {
			animals[i].move();
		}
	}

}
