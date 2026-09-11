// package Day_4; -> Your package name
import java.util.Scanner;
public class For_loop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Even number");
		for(int i = 2; i<=20; i+=2) {System.out.print(i+" ");}
		System.out.println("\n\nOdd number");
		for(int i = 1; i<20; i+=2) {System.out.print(i+" ");}
		
		//Tables
		System.out.println("\n\nTables");
		System.out.print("Enter a number to print table: ");
		int a = s.nextInt();
		for(int i=1;i<=10;i++) {System.out.println(a + " * " + i + " = " + a*i);}
		
		System.out.println("\n\nDivisibile by 3");
		System.out.print("Enter a number: ");
		int b = s.nextInt();
		for(int i=1;i<=b;i++) {if(i%3==0) {System.out.print(i + " ");}}
		
		System.out.println("\n\nSum of natural number");
		System.out.print("Enter a number: ");
		int c = s.nextInt();
		int ac=0;
		for(int i=0;i<=c;i++) {ac+=i;}
		System.out.print("The sum of all natural number from 0-"+c+" is "+ac);
		
		System.out.println("\n\nFactorial of number");
		System.out.print("Enter a number: ");
		int d = s.nextInt();
		long ad=1;
		for(int i=1;i<=d;i++) {ad*=i;}
		System.out.print("The factorial of "+d+" is "+ad);
		
		System.out.println("\n\nFactors of number");
		System.out.print("Enter a number: ");
		int e = s.nextInt();
		System.out.print("The factors of "+e+" is [ ");
		for(int i=1;i<=e;i++) {if(e%i==0) {System.out.print(i+" ");}}
		System.out.println("]");
		
		System.out.println("\n\nPrime number");
		System.out.print("Enter a number: ");
		int f = s.nextInt();
		boolean p = true;
		if(f!=2 && f!=1) {
			for(int i=2;i<f;i++) {
				if(f%i==0) {
					p = false;
					break;
					}
				}
			}
		if(p) {System.out.print("It's a prime number");}
		else {System.out.print("It's not a prime number");}

		System.out.println("\n\nFibonacci series");
		System.out.print("Enter a number: ");
		int g = s.nextInt();
		int first = 0, sec = 1;
		System.out.print("Fibonacci series: "+first+" ");
		for(int i=1;i<=g;i++) {
				int third = first + sec;
				first = sec;
				sec = third;
				System.out.print(first+" ");
		}
		
	}
}

