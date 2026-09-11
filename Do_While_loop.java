// package Day_4; -> Your package name
import java.util.Scanner;
public class Do_while_loop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Calculator using do-whlie
		char c;
		do {
		System.out.print("Enter a number 1: ");
		int a = s.nextInt();
		System.out.print("Enter a number 2: ");
		int b = s.nextInt();
		s.nextLine();
		System.out.print("Which operation to perform: ");
		String ope = s.nextLine();
		switch(ope){
		case "-": System.out.println(a+" - "+b+" = "+ (a-b));break;
		case "+": System.out.println(a+" + "+b+" = "+ (a+b));break;
		case "*": System.out.println(a+" * "+b+" = "+ (a*b));break;
		case "/": System.out.println(a+" / "+b+" = "+ (a/b));break;
		case "%": System.out.println(a+" % "+b+" = "+ (a%b));break;
		default: System.out.println("Invalid operation");break;}
		
		System.out.println("Do you want to continue(y/n)");
		c = s.next().charAt(0);
		}while(c=='y');
		
		//Menu care bill calculator
		char item;
		int total = 0;
		
		do {
		System.out.print("Enter your dish name: ");
		String a = s.nextLine();
		System.out.print("Enter your  quantity: ");
		int b = s.nextInt();
		switch(a){
		case "Dosa": total+= 20*b;break;
		case "Rice": total+= 80*b;break;
		case "Porota": total+= 20*b;break;
		case "iddli": total+= 15*b;break;
		case "Briyani": total+= 120*b;break;
		default: System.out.println("Invalid choose");break;}
		System.out.print("Do you have next item(y/n): ");
		item = s.next().charAt(0);
		s.nextLine();
		}while(item=='y');
		System.out.print("\nYour bill's comes around RS."+total);
	}
}
