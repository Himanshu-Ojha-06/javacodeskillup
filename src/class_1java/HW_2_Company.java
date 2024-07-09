package class_1java;

public class HW_2_Company {

	String Business;
	int Revenue;
	
	String setBusiness() {
		this.Business = "IT";
		return this.Business;
		
	}
	int setRevenue(int Rev) {
		return this.Revenue=Rev;
	}
	
	
	int revenueincrese(int Revenue) {
		
		this.Revenue = Revenue;
		Revenue+=100000;
		
		return Revenue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW_2_Company CTS = new HW_2_Company();
		String a = CTS.setBusiness();
		System.out.println(a);
		
		int NewRev = CTS.revenueincrese(400000);
		System.out.println(NewRev);
		System.out.println(CTS.Business);
		System.out.println(CTS.Revenue);
		
		HW_2_Company TATA = new HW_2_Company();
		TATA.setRevenue(600000);
		System.out.println(TATA.Revenue);
	}

}
