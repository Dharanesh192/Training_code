// package Bacis; -> Your package name
import java.util.Scanner;
public class ASCII {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char c = s.next().charAt(0);
		int a = c;
		
		System.out.print("Enter a ASCII number : ");
		int as = s.nextInt();
		char ch = (char)as;
		
		System.out.print("Enter Character in small : ");
		char low = s.next().charAt(0);
		char upper = (char)(low-32);
		
		System.out.print("Enter Character in caps: ");
		char up = s.next().charAt(0);
		char lo = (char)(up-32);
		
		System.out.println("Character : "+c);
		System.out.println("Character to integer : "+a);
		System.out.println("Integer : "+as);
		System.out.println("Integer to Character : "+ch);
		System.out.println("User lower Character : "+low);
		System.out.println("Upper Character : "+upper);
		System.out.println("User upper Character : "+up);
		System.out.println("Lower Character : "+lo);
	}
}
