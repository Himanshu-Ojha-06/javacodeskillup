//this program is made to make methods and call them by tradantial way and Dynamic object way.
package class_2java;

public class HW_1 {
	//first way to make an integar array
	int[] Array_1 = new int[5];
	//constructor to initialize the values
	public HW_1() {
		Array_1[0]=0;
		Array_1[1]=1;
		Array_1[2]=2;
		Array_1[3]=3;
		Array_1[4]=4;
	}
	
	public void method_1() {
		
		for (int i : Array_1) {
			System.out.println(i);
		}
	}
	//Second way to declare an Array of integar
	int[] Array_2 = {1,2,3,4};
	public void method_2() {
		for(int i : Array_2) {
			System.out.println(i);
		}
	}
	//third way to declare an Array of integar
	int[] Array_3 = new int[] {2,3,4};
	public void method_3() {
		for (int i: Array_3) {
			System.out.println(i);	
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Method-1");
		new HW_1().method_1();
		System.out.println("Method-2");
		HW_1 obj = new HW_1();
		obj.method_2();
		System.out.println("Method-3");
		new HW_1().method_3();  

	}

}
