import java.util.Scanner;
 
public class S37_11021 {
	public static void main(String args[]) {
 
		Scanner scanner = new Scanner(System.in);
 
		int a = scanner.nextInt();
 
		for (int i = 1; i <= a; i++) {
			int c = scanner.nextInt();
			int d = scanner.nextInt();
 
			System.out.println("Case #" + i + ": " + (c + d));
		}
 
		scanner.close();
	}
}