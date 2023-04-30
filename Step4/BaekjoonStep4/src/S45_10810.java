import java.util.Scanner;

public class S45_10810 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int array[] = new int[n];
		
		for(int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			for(int j = a - 1; j <  b; j++) {
				array[j] = c;
			}
		}
		for(int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}
}