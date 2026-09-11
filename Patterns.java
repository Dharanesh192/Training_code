// package Day_5; -> Your package name
import java.util.Scanner;
public class Patterns {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to print the patter: ");
		int a = s.nextInt();
		System.out.println("Box pattern");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Right angle triangle");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Right angle down triangle");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Left angle triangle");
				for(int i=1;i<=a;i++) {
					for(int k=1;k<=a-i;k++) {
						System.out.print("  ");
					}
					for(int j=1;j<=i;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				System.out.println();
		
		System.out.println("Left angle down triangle");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=a-i+1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
				
		System.out.println("Right angle triangle in number");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Right angle triangle in same number");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Right angle triangle in same number");
		int c = 1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Odd pyramid");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Odd inverted pyramid");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=(a-i)*2+1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Same pyramid");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Same inverted pyramid");
		for(int i=a;i>=1;i--) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Rhombus");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=a;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Pyramid Diamond");
		int h,m;
		for(int i=1;i<=a*2-1;i++) {
			h=(a<=i)?i-a:a-i;
			for(int j=1;j<=h;j++) {
				System.out.print("  ");
			}
			m=(a<i)?(a*2-1)-(i-a)*2:2*i-1;
			for(int k=1;k<=m;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Hollow pyramid diamond");
		int x,y;
		for(int i=1;i<=a*2-1;i++) {
			x=(a<=i)?i-a:a-i;
			for(int j=1;j<=x;j++) {
				System.out.print("  ");
			}
			y=(a<i)?(a*2-1)-(i-a)*2:2*i-1;
			for(int k=1;k<=y;k++) {
				System.out.print((k==1||k==y)?"* ":"  ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Diamond");
		int q,r;
		for(int i=1;i<=a*2-1;i++) {
			q=(a<=i)?i-a:a-i;
			for(int j=1;j<=q;j++) {
				System.out.print(" ");
			}
			r=(a<i)?i-(i-a)*2:i;
			for(int k=1;k<=r;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("Pyramid number");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");}
			
			for(int t=i-1;t>=1;t--) {
					System.out.print(t+" ");}
			System.out.println();
		}
		System.out.println();

	}
}
