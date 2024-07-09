package class_1java;

public class HW_1_Product {
	int price;
	String Location;
	
	int setPrice(int price)
	{
		this.price = price;
		return this.price;
	}
	String setLocation(String Location)
	{
		this.Location = Location;
		return this.Location;
	}
	
	
	public static void main(String[] args) {
		HW_1_Product Horlicks = new HW_1_Product();
		int a = Horlicks.setPrice(150);
		String s = Horlicks.setLocation("Dmart");
		System.out.println(a);
		System.out.println(s);
		HW_1_Product Complain = new HW_1_Product();
		int b = Complain.setPrice(200);
		String s1 = Complain.setLocation("BigBazar");
		System.out.println(b);
		System.out.println(s1);
		
		System.out.println("Price of Horlicks is "+Horlicks.price+" Location is "+Horlicks.Location);
		System.out.println("Price of Complain is "+Complain.price+" Location is "+Complain.Location);
	}

}
