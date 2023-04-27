import java.util.Arrays;
import java.util.Scanner;
public class S43_10818 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int array[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
			
		}
		
		scanner.close();
		Arrays.sort(array);
		System.out.print(array[0] + " " + array[n - 1]);
		
		
	}

}
