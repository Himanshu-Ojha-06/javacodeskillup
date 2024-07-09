package class_2java;

public class CW_1 {
	
	//maximum size of Array is 3 
	//1st method to declare Array
	int[] values = new int[3];
	
	public CW_1() 
	{
	values[0]=1;
	values[1]=2;
	values[2]=3;
	}
	public void displayvalues() {
		//enhanced for loop
		for(int i : values)
		{
			System.out.println(i);	
			}
		}
	//2nd method to declare Array
	int[] assignValuesnew = {56,34,12,22,34};
	
	public void displayAssignedValues() {
		for(int i :assignValuesnew) {
			System.out.println(i);
		}
	}
	//String Array declaration
	String[] DropDown = new String[]{"m","F","T"};
	
	//3rd method to declare Array
	int[] assignedValuesnew = new int[] {121,122,123};
	
	public void displayAssignedValuesNew() {
		for(int temp : assignedValuesnew) {
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1st method");
		//dynamic way to make instances it gets deleted after use-> new constructorname().methodname();
		new CW_1().displayvalues();
		System.out.println("2nd Method");
		new CW_1().displayAssignedValues();
		System.out.println("3rd Method");
		new CW_1().displayAssignedValuesNew();

	}

}
