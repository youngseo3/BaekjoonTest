import java.util.Scanner;

public class S46_10813 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int array[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		
		for (int j = 0; j < m; j++) {
			int tmp;
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			tmp = array[a-1];
			array[a-1] = array[b-1];
			array[b-1] = tmp;
		}
		scanner.close();
		
		for (int result : array)
			System.out.print(result + " ");
	}

}
