import java.util.Scanner;

public class S47_5597 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int array[] = new int[31];
		
		for (int i = 1; i < 29; i++) {
			int s = scanner.nextInt();
			array[s] = 1;
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] != 1)
				System.out.println(i);
		}
		scanner.close();
	}

}
