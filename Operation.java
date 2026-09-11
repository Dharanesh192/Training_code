// package Day_2; -> Your package name
import java.util.Scanner;
public class Operation {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number a : ");
		int a = s.nextInt();
		System.out.print("Enter a number b : ");
		int b = s.nextInt();
		System.out.print("Enter a number c : ");
		int c = s.nextInt();
		
		System.out.println("\nArithmetic operator: ");
		System.out.println("Addition: " + (c+a+b));
		System.out.println("Subtraction: " + (c-b-a));
		System.out.println("Multplication: " + (c*b*a));
		System.out.println("Division: " + ((c/a)/b));
		System.out.println("Modular: " + ((c%a)%b));
		
		System.out.println("\nRelational operator: ");
		System.out.println("(a<b): " + (a<b));
		System.out.println("(a>b): " + (a>b));
		System.out.println("(a==b): " + (a==b));
		System.out.println("(a!=b): " + (a!=b));
		System.out.println("(a>=b): " + (a>=b));
		System.out.println("(a<=b): " + (a<=b));
		
		System.out.println("\nAssignment operator: ");
		System.out.println("Starting value of 'c': " + c);
		c+=10;
		System.out.println("c+=10: " + c);
		c-=5;
		System.out.println("c-=5: " + c);
		c*=3;
		System.out.println("c*=3: " + c);
		c/=4;
		System.out.println("c/=4: " + c);
		c%=8;
		System.out.println("c%=8: " + c);
		
		System.out.println("\nLogical operator: ");
		System.out.println("((a<b) && (a<45)): " + ((a<b) && (a<45)));
		System.out.println("((a>=b) || (b<a)): " + ((a>=b) || (b<a)));
		System.out.println("(!(a<45)): " + !(a<45));
		
		System.out.println("\nBitwise operator: ");
		System.out.println("(a&b): " + (a&b));
		System.out.println("(a|b): " + (a|b));
		System.out.println("(a^b): " + (a^b));
		System.out.println("~a: " + ~a);
		System.out.println("(a>>1): " + (a>>1));
		System.out.println("(a<<1): " + (a<<1));
		
		System.out.println("\nUnary operator:");
		int d = 10;
		System.out.println("Starting value of d: "+ d);
		System.out.println("Per increment (++d): "+ ++d);
		System.out.println("Per decrement (--d): "+ --d);
		System.out.println("Post increment (d++): "+ d++);
		System.out.println("Post decrement (d--): "+ d--);
	}
}
