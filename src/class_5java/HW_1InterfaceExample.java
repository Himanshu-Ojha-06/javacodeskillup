package class_5java;

interface GovtEducationPolicy{
	public void NewEducationPolicy();
}

interface NaacUniversities extends GovtEducationPolicy{
	public void NewMarkingScheme();
}


class DelhiUniversity implements NaacUniversities{
	public void NewMarkingScheme() {
		System.out.println("Marking Scheme For DU");
	}
	public void NewEducationPolicy() {
		System.out.println("Education policy for DU");
	}
}

class MadrasUniversity implements NaacUniversities{
	public void NewMarkingScheme() {
		System.out.println("Marking Scheme For MU");
	}
	public void NewEducationPolicy() {
		System.out.println("Education policy for MU");
	}
}

public class HW_1InterfaceExample {

	public static void main(String[] args) {
		//interface variable and  subclass instance
		NaacUniversities d = new DelhiUniversity();
		d.NewEducationPolicy();
		d.NewMarkingScheme();
		
		//subclass variable and subclass instance
		DelhiUniversity d1 = new DelhiUniversity();
		d1.NewEducationPolicy();
		d1.NewMarkingScheme();
		
		//interface variable and subclass instance
		NaacUniversities m = new MadrasUniversity();
		m.NewMarkingScheme();
		m.NewEducationPolicy();
		
		//subclass variable and subclass instance
		MadrasUniversity m1 = new MadrasUniversity();
		m1.NewMarkingScheme();
		m1.NewEducationPolicy();
		

	}

}
