import java.util.Scanner;

public class S26_2525 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int C = scanner.nextInt();
		
		scanner.close();
		
		int min = A * 60 + B;
		min += C;
		
		int hour = ( min / 60)%24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);	
	}
}