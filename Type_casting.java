// package Day_2; -> Your package name

public class Type_casting {
	public static void main(String [] args) {
		double d = 45.67;
		int n = 123;
		double ad = n;
		int an = (int)d; // We need to mention the type if we are converting from higher to lower level datatype like (double -> int)
		
		System.out.println("Value of the integer n is "+n);
		System.out.println("Value of the double d is "+d);
		System.out.println("Value of the alter_integer an is "+an);
		System.out.println("Value of the alter_double ad is "+ad);
	}
}
