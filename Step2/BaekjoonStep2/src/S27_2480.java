import java.util.Scanner;

public class S27_2480 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		scanner.close();
		
		if (a!=b && b!=c && a!=c) {
			int max;
			
			if(a > b) { // a > b
				if (c > a) { // c > a > b
					max = c;
				}
				else { // a > (b, c)
					max = a;
				}
			}
			else { // b > a
				if (c > b) { // c > b > a
					max = c;
				}
				else { // b > c
					max = b;	
				}
			}
			System.out.println( max * 100 );
		} 
		else {
			if (a == b && b == c ) { // a = b = c
				System.out.println(10000 + a * 1000);
			} 
			else {
				if (a == b || a == c) { // a = b or a = c
					System.out.println(1000 + a * 100);
				} 
				else System.out.println(1000 + b * 100); // b = c
			}	
		}		
	}
}