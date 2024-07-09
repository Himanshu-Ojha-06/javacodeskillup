package class_4java;
//example of method overloading
public class CW_1 {
	static int sum(int a,int b)
	{
		return a+b;
	}
	static int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	static double sum(double a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		CW_1 obj = new CW_1();
		int s1 = obj.sum(2,3);
		int s2 = obj.sum(1,4,5);
		double s3 = obj.sum(1.5,1,1);
		
		System.out.println("sum of two int "+s1);
		System.out.println("sum of three int "+s2);
		System.out.println("sum of one double two int "+s3);

	}

}
